package com.gosnappay.payment;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @PostMapping("/charge")
    public ResponseEntity<String> charge(@RequestBody PaymentRequest request) {
        return ResponseEntity.ok("payment_successful");
    }
}