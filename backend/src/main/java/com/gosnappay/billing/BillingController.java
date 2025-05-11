package com.gosnappay.billing;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/billing")
public class BillingController {
    @PostMapping("/subscribe")
    public ResponseEntity<String> subscribe(@RequestBody SubscriptionRequest request) {
        return ResponseEntity.ok("subscribed");
    }
}