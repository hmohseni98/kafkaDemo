package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerSecond {

    @KafkaListener(topics = "first_topic", groupId = "group_id2")
    public void consume(String message) {System.out.println("Consumer 2 Received message: " + message);}
}
