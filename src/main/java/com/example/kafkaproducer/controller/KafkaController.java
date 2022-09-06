package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.broker.producer.KafkaTopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private final KafkaTopicProducer kafkaTopicProducer;

    @GetMapping(value = "/{msg}")
    public void send(@PathVariable String msg){
        kafkaTopicProducer.send(msg);
    }
}

