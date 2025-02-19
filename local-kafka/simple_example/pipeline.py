import apache_beam as beam
from apache_beam.io.kafka import ReadFromKafka
from apache_beam.io.kafka import WriteToKafka
from apache_beam.options.pipeline_options import PipelineOptions

class ProcessMessage(beam.DoFn):
    def process(self, element):
        key, value = element
        processed_value = value.upper()
        yield (key, processed_value)

# Set up the pipeline
pipeline_options = PipelineOptions()
kafka_config = {
    'bootstrap.servers': 'localhost:9092',
    'group.id': 'beam_group',
    'auto.offset.reset': 'earliest',
    'max.partition.fetch.bytes': '1048576',  # 1MB
    'fetch.max.bytes': '52428800',  # 50MB,
}

# Run the pipeline
with beam.Pipeline(options=pipeline_options) as p:
    messages = (p 
        | "Read from Kafka" >> ReadFromKafka(
            consumer_config=kafka_config,
            topics=['input-topic']
        )
        | "Process Messages" >> beam.ParDo(ProcessMessage())
        | "Write to Kafka" >> WriteToKafka(
            producer_config=kafka_config,
            topic='output-topic'
        )
    )