package com.gosnappay.billing;

import java.util.List;
import java.util.ArrayList;

public class BillingService {
    public List<String> recurringPayments = new ArrayList<>();

    public void addSubscription(String userId, String token) {
        recurringPayments.add(userId + ":" + token);
    }

    public void process() {
        for (String entry : recurringPayments) {
            System.out.println("Billing " + entry);
        }
    }
}