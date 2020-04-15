# starting-with-kafka

-> A sample project to begin learning with Apache Kafka, producers-consumers.

#### Commands to start zookeeper first, and then Kafka server:
(** Opened cmd on path Kafka\config)

* zookeeper-server-start.bat zookeeper.properties

* kafka-server-start.bat server.properties

#### Other Commands to create topics & consume any particular topic and fetching existing topics' partition details etc :

* kafka-topics.bat --bootstrap-server 127.0.0.1:9092 --create --topic first --partitions 3

* kafka-topics.bat --bootstrap-server 127.0.0.1:9092 --list

* kafka-topics.bat --bootstrap-server 127.0.0.1:9092 --describe

