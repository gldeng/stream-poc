import logging
import sys
from typing import List

import apache_beam as beam
from apache_beam.io.kafka import ReadFromKafka
from apache_beam.io.kafka import WriteToKafka
from apache_beam.options.pipeline_options import GoogleCloudOptions
from apache_beam.options.pipeline_options import PipelineOptions


class TokenUsage(object):
  def __init__(self, 
               operation_name: str,
               request_model: str,
               response_model: str,
               system: str,
               token_type: str,
               server_address: str,
               server_port: int,
               input_tokens: float,
               output_tokens: float) -> None:
    self.operation_name = operation_name
    self.request_model = request_model
    self.response_model = response_model
    self.system = system
    self.token_type = token_type
    self.server_address = server_address
    self.server_port = server_port
    self.input_tokens = input_tokens
    self.output_tokens = output_tokens


def run(
    bootstrap_servers,
    input_topic,
    output_topic,
    with_metadata,
    pipeline_options):

  def extract_attributes(attributes):
    output = {
      'operation_name': None,
      'request_model': None,
      'response_model': None,
      'system': None,
      'token_type': None,
      'server_address': None,
      'server_port': None,
    }
    for attribute in attributes:
      if attribute['key'] == "gen_ai.operation.name":
        output['operation_name'] = attribute['value']['stringValue']
      elif attribute['key'] == "gen_ai.request.model":
        output['request_model'] = attribute['value']['stringValue']
      elif attribute['key'] == "gen_ai.response.model":
        output['response_model'] = attribute['value']['stringValue']
      elif attribute['key'] == "gen_ai.system":
        output['system'] = attribute['value']['stringValue']
      elif attribute['key'] == "gen_ai.token.type":
        output['token_type'] = attribute['value']['stringValue']
      elif attribute['key'] == "server.address":
        output['server_address'] = attribute['value']['stringValue']
      elif attribute['key'] == "server.port":
        output['server_port'] = attribute['value']['intValue']
    return output

  def extract_token_usage(data) -> List[TokenUsage]:
    output = []
    resourceMetrics = data['resourceMetrics']
    for resourceMetric in resourceMetrics:
      for scopeMetric in resourceMetric['scopeMetrics']:
        scope = scopeMetric['scope']
        name = scope['name']
        if name != "OpenAI.ChatClient":
          continue
        metrics = metric['metrics']
        for metric in metrics:
          if metric['name'] != "gen_ai.client.token.usage":
            continue
          histogram = metric['histogram']
          dataPoints = histogram['dataPoints']
          input_tokens = 0
          for dataPoint in dataPoints:
            extracted = extract_attributes(dataPoint['attributes'])
            if extracted['token_type'] == "input":
              input_tokens = dataPoint['sum']
            elif extracted['token_type'] == "output":
              extracted['input_tokens'] = input_tokens
              extracted['output_tokens'] = dataPoint['sum']
              output.append(TokenUsage(**extracted))
    return output

  def convert_kafka_record_to_dictionary(record):
    # the records have 'value' attribute when --with_metadata is given
    if hasattr(record, 'value'):
      ride_bytes = record.value
    elif isinstance(record, tuple):
      ride_bytes = record[1]
    else:
      raise RuntimeError('unknown record type: %s' % type(record))
    # Converting bytes record from Kafka to a dictionary.
    import ast
    ride = ast.literal_eval(ride_bytes.decode("UTF-8"))
    output = {
        key: ride[key]
        for key in ['latitude', 'longitude', 'passenger_count']
    }
    if hasattr(record, 'timestamp'):
      # timestamp is read from Kafka metadata
      output['timestamp'] = record.timestamp
    return output

  with beam.Pipeline(options=pipeline_options) as pipeline:

    raw_data_token_usage_col = (
        pipeline
        | ReadFromKafka(
            consumer_config={'bootstrap.servers': bootstrap_servers},
            topics=[input_topic],
            with_metadata=with_metadata)
        | beam.Map(lambda record: convert_kafka_record_to_dictionary(record)))

    _ = (
      raw_data_token_usage_col
      | beam.FlatMap(lambda data: extract_token_usage(data))
      | WriteToKafka(
            producer_config={'bootstrap.servers': bootstrap_servers},
            topic=output_topic))


if __name__ == '__main__':
  logging.getLogger().setLevel(logging.INFO)
  import argparse

  parser = argparse.ArgumentParser()
  parser.add_argument(
      '--bootstrap_servers',
      dest='bootstrap_servers',
      required=True,
      help='Bootstrap servers for the Kafka cluster. Should be accessible by '
      'the runner')
  parser.add_argument(
      '--input-topic',
      dest='input_topic',
      default='raw-token-usage',
      help='Kafka topic to read from')
  parser.add_argument(
      '--output-topic',
      dest='output_topic',
      default='token-usage',
      help='Kafka topic to write to')
  parser.add_argument(
      '--with_metadata',
      default=False,
      action='store_true',
      help='If set, also reads metadata from the Kafka broker.')
  known_args, pipeline_args = parser.parse_known_args()

  pipeline_options = PipelineOptions(
      pipeline_args, save_main_session=True, streaming=True)

  run(
      known_args.bootstrap_servers,
      known_args.input_topic,
      known_args.output_topic,
      known_args.with_metadata,
      pipeline_options)