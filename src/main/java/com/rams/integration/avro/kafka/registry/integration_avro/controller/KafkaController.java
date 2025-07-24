package com.rams.integration.avro.kafka.registry.integration_avro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rams.integration.avro.kafka.registry.integration_avro.service.producer.ProducerService;
import com.rams.kafka.avro.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v1/api")
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody User request) {
        
        try {
            producerService.sendMessage(request);
            return ResponseEntity.ok(request.getId().toString());
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(request.getId().toString());
        }
    }

    @GetMapping()
    public String HelloSpringboot() {
        return new String("Hello Springboot");
    }
    
    
}
