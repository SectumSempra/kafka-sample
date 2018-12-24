package com.be.kafkasample.kafkastream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class GreetingsListener {

    @StreamListener(GreetingStream.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {

        System.err.println("Consumed :" + greetings);
    }
}
