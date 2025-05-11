package com.gosnappay.sqs;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import org.springframework.stereotype.Service;

@Service
public class SqsSender {
    private final AmazonSQS sqs;
    public SqsSender(AmazonSQS sqs) { this.sqs = sqs; }

    public void send(String queueUrl, String msg) {
        sqs.sendMessage(new SendMessageRequest(queueUrl, msg));
    }
}