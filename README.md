# kafka-consumer

Steps ::

1. docker-compose -f docker-compose.yml up -d
2. docker ps
3. Create Topic:  docker exec -it kafka kafka-topics.sh --create --bootstrap-server kafka:9092 --topic test-topic
4. Producer: docker exec -it kafka kafka-console-producer.sh --bootstrap-server kafka:9092 --topic test-topic
5. Consumer: docker exec -it kafka kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic test-topic --from-beginning ( To check if Kafka is configured correctly)

Run springboot application.
Drop json in producer console:

Json:
{ "Id": 2, "HostName": "YY259485", "Category": 11, "LogMessage": "ServiceHostHelper: Reinitializing configuration", "Severity": 1, "LogTime": 1651249479715, "ProcessName": "Philips.FocusPoint.ConfigurationHost", "ThreadName": "", "CallStack": "", "LastUpdated": 1651249479716 }
