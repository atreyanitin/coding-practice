package com.bigdata.kafka.producer;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.log4j.BasicConfigurator;

public class FirstProducer {

	public FirstProducer() {
	}

	public static void main(String args[]) {
		BasicConfigurator.configure();

		Properties props = new Properties();
		props.put("bootstrap.servers", "172.17.0.5:9091");
		props.put("client.id", "javaproducer");
		props.put("acks", "all");
		props.put("retries", 5);
		props.put("batch.size", 1);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String, String> producer = new KafkaProducer<>(props);
		for (int i = 0; i < 1000; i++) {
			producer.send(new ProducerRecord<String, String>("chatterbox2", 0, null, "emailreceived"));
			producer.flush();
		}
		producer.close(1000, TimeUnit.MILLISECONDS);

	}

}
