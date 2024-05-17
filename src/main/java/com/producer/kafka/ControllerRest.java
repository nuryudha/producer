package com.producer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ControllerRest {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("pesan/{message}")
    public void pesan(@PathVariable String message) {
        kafkaTemplate.send("pertama", message);
        System.out.println("Sending");

    }

}
