package com.gosnappay.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class QueueConsumer {
    @RabbitListener(queues = "paymentQueue")
    public void consume(String message) throws InterruptedException {
        try {
            System.out.println("Processing message: " + message);
            if (Math.random() < 0.5) throw new RuntimeException("Transient error");
        } catch (Exception e) {
            System.out.println("Retrying message: " + message);
            Thread.sleep(5000);
            consume(message);
        }
    }
}