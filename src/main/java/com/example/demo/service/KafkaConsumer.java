package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "first_topic", groupId = "group_id1")
    public void consume(String message) {System.out.println("Consumer 1 Received message: " + message);}
}
