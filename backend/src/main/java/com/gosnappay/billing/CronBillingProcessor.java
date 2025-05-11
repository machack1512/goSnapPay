package com.gosnappay.billing;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronBillingProcessor {
    private final BillingService billingService;

    public CronBillingProcessor(BillingService billingService) {
        this.billingService = billingService;
    }

    @Scheduled(cron = "0 0 * * * *")
    public void processRecurring() {
        System.out.println("Running recurring billing...");
        billingService.process();
    }
}