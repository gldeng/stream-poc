
flink run \
    --python streaming-token-usage.py \
    --bootstrap_servers broker:29092 \
    --input_topic otlp-metrics \
    --output_topic token-usage \
    --flink_master localhost:8081
