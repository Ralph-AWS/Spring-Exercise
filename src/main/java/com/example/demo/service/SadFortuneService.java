package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Better days are coming.";
    }
}