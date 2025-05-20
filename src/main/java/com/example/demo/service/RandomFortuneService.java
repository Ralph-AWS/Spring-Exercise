package com.example.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class RandomFortuneService implements FortuneService {
    private final String[] fortunes = {
            "Today is your lucky day!",
            "Be cautious of unexpected events.",
            "Success is on your horizon.",
            "You're doing great, keep going!",
    };
    private final Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }

    public Random getRandom() {
        return random;
    }
}