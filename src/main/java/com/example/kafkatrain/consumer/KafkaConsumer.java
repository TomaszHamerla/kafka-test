package com.example.kafkatrain.consumer;

import com.example.kafkatrain.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

   // @KafkaListener(topics = "mytest", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info("Consuming the message : " + msg);
    }

    @KafkaListener(topics = "mytest", groupId = "myGroup")
    public void consumeJsonMsg(Student msg){
        log.info("Consuming the message : " + msg.toString());
    }


}
