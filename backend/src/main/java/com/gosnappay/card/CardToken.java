package com.gosnappay.card;

import javax.persistence.*;

@Entity
public class CardToken {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String token;
    public String encryptedCard;
    public Long userId;
}