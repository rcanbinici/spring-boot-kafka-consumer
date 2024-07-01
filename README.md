# spring-boot-kafka-consumer

# documents

## Open Source Kafka Startup in local ##

1. Start Zookeeper Server

    ```bin\windows\zookeeper-server-start.bat config\zookeeper.properties```

2. Start Kafka Server / Broker

    ```bin\windows\kafka-server-start.bat config\server.properties```

3. Create topic

    ```bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --topic kafka-demo --create --partitions 3 --replication-factor 1```

4. list out all topic names

    ```bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list ```

5. Describe topics
  
    ```bin\windows\kafka-topics.bat --describe --topic kafka-demo --bootstrap-server localhost:9092 ```

6. Produce message

    ```bin\windows\kafka-console-producer.bat --topic kafka-demo --broker-list localhost:9092 ```


7. consume message

    ```bin\windows\kafka-console-consumer.bat --topic kafka-demo --from-beginning --broker-list localhost:9092  ```
