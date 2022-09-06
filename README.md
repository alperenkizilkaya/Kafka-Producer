# Kafka-Producer
Springboot Kafka Producer and Consumer demo example


Download the Kafka from -> 
      
      https://kafka.apache.org/downloads
			
      Binary downloads:
	    
      ⁃Scala 2.12  - kafka_2.12-3.2.1.tgz (asc, sha512)


Open terminal and 

Go to the directory that you download in -> 

      cd Desktop/programs/kafka_2.12-3.2.1

Start zookeeper with terminal -> 
				
          bin/zookeeper-server-start.sh config/zookeeper.properties
Start Kafka with terminal -> 
				
          bin/kafka-server-start.sh config/server.properties


Spring boot configuration ->

	-> Create two seperate springboot projects that’s names: 
		1) Kafka-Producer :  Creates topics and send messages to these topics
		2) Kafka-Consumer : Listens topics and see messages

	-> dependencies : 
		1) spring-web 
		2) spring-kafka 
		3)lombok

	-> configure the application.properties for each 
        spring.kafka.producer.bootstrap-servers=127.0.0.1:9092
        spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
        spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
        spring.kafka.producer.group-id=group_id
        topic.name.producer=topic.test123
		
		***One extra config for producer
        auto.create.topics.enable=true

	-> run both projects and go to the end point:
		localhost:8082/kafka/message      ****message: you can write whatever you want
	
	-> and check logs of Kafka-Consumer projects 




After run the app one time, you can check your topics on terminal 	
	
    ->  bin/kafka-topics.sh --bootstrap-server=localhost:9092 --list
		
		
	
						
						
