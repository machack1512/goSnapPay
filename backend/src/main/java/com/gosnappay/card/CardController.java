package com.gosnappay.card;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.UUID;

@RestController
@RequestMapping("/api/card")
public class CardController {
    @PostMapping("/tokenize")
    public ResponseEntity<String> tokenizeCard(@RequestBody CardRequest request) {
        String token = UUID.randomUUID().toString();
        return ResponseEntity.ok(token);
    }
}