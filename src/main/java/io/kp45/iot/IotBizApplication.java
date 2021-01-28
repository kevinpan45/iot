package io.kp45.iot;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class IotBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotBizApplication.class, args);
	}

	@KafkaListener(topics = "transportMessageForEvent", groupId = "iot-biz-backend")
    public void handler(ConsumerRecord<String, String> record) {
        System.out.println("Recieve data : " + record.value());
    }

}
