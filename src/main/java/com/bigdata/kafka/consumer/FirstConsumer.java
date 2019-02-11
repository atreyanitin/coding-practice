package com.bigdata.kafka.consumer;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.log4j.BasicConfigurator;

public class FirstConsumer {
	
	
	public static void main(String args[]) {
		
		BasicConfigurator.configure();

		 Properties props = new Properties();
	      props.put("bootstrap.servers", "172.17.0.5:9091");
	      props.put(ConsumerConfig.GROUP_ID_CONFIG,
	                                  "KafkaFirstConsumer");
	      props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	              LongDeserializer.class.getName());
	      props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
	              StringDeserializer.class.getName());

	      // Create the consumer using props.
	      final Consumer<Long, String> consumer =
	                                  new KafkaConsumer<>(props);

	      // Subscribe to the topic.
	      consumer.subscribe(Collections.singletonList("chatterbox2"));
	      
	      final int giveUp = 100;   int noRecordsCount = 0;

	        while (true) {
	            final ConsumerRecords<Long, String> consumerRecords =
	                    consumer.poll(1000);

	            if (consumerRecords.count()==0) {
	                noRecordsCount++;
	                if (noRecordsCount > giveUp) break;
	                else continue;
	            }

	            consumerRecords.forEach(record -> {
	                System.out.printf("Consumer Record:(%d, %s, %d, %d)\n",
	                        record.key(), record.value(),
	                        record.partition(), record.offset());
	            });

	            consumer.commitAsync();
	        }
	        consumer.close();
	        System.out.println("DONE");
		
	}

}
