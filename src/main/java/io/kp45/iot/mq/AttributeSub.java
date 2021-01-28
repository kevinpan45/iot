package io.kp45.iot.mq;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class AttributeSub {
    @KafkaListener(topics = "transportMessageForEvent")
    public void handler(ConsumerRecord<String, String> record) {
        System.out.println("Recieve data : " + record.value());
    }
}
