package com.rams.integration.avro.kafka.registry.integration_avro.service.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.rams.kafka.avro.model.User;

@Service
public class ProducerService {
    private final KafkaTemplate<String, User> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User user) {
        kafkaTemplate.send("user-topic", user.getId().toString(), user);
        System.out.println("Message sent to Kafka topic: user-topic with key: " + user.getId() + " and value: " + user);
    }
}