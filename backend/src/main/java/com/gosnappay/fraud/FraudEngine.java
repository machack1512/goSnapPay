package com.gosnappay.fraud;

public class FraudEngine {
    public boolean isFraud(double amount, String location) {
        return amount > 10000 || location.equalsIgnoreCase("suspicious-region");
    }
}