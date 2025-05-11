package com.gosnappay.payment;

import javax.persistence.*;

@Entity
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String cardToken;
    public double amount;
    public String merchantId;
}