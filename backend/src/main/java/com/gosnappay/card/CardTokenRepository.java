package com.gosnappay.card;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTokenRepository extends JpaRepository<CardToken, Long> {
    CardToken findByToken(String token);
}