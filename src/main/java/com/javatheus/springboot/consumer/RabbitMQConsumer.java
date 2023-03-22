package com.javatheus.springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;

public class RabbitMQConsumer {

    private RabbitTemplate rabbitTemplate;
    private String[] queues;

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(String message) {
        System.out.printf("Received message: %s", message);
    }

}
