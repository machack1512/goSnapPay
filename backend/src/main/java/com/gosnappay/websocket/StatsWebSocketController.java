package com.gosnappay.websocket;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import java.util.Map;
import java.util.HashMap;

@Controller
public class StatsWebSocketController {
    @MessageMapping("/stats")
    @SendTo("/topic/stats")
    public Map<String, Integer> sendStats() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("users", 123);
        stats.put("payments", 456);
        return stats;
    }
}