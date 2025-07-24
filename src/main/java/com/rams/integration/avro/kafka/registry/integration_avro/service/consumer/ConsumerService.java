package com.rams.integration.avro.kafka.registry.integration_avro.service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.rams.kafka.avro.model.User;

@Service
public class ConsumerService {

    @KafkaListener(topics = "user-topic", groupId = "sample-group")
    public void consume(User user) {
        System.out.println("Consumed message: " + user);
    }
}