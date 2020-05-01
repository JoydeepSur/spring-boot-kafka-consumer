# spring-boot-kafka-consumer

Create topic:
Kafka_Example              --> accept String

Kafka_Example_Json              --> accept User Json below 

{
	"name": "Joydeep",
	"dept": "IT",
	"salary": 12000
}



Please also clone spring-boot-kafka-producer to produce messages on to the queue.


Kafka commands:
(all command should run on kafka folder)

start kafka:
.\bin\windows\kafka-server-start.bat .\config\server.properties

stop kafka:
.\bin\windows\kafka-server-stop.bat .\config\server.properties

create topic:
.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic Kafka_Example

.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic Kafka_Example_Json

describe topic:
.\bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic Kafka_Example

.\bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic Kafka_Example_Json

create producer:
.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic Kafka_Example

.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic Kafka_Example_Json

create consumer:
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --from-beginning --topic Kafka_Example

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --from-beginning --topic Kafka_Example_Json