package com.gosnappay.fraud;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/fraud")
public class FraudController {
    @PostMapping("/check")
    public ResponseEntity<String> checkFraud(@RequestBody FraudCheckRequest request) {
        if (request.amount > 10000) {
            return ResponseEntity.ok("fraud_suspected");
        }
        return ResponseEntity.ok("no_fraud");
    }
}