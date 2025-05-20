package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.Coach;

@RestController
@RequestMapping("/api/coach")
public class CoachController {
    private final Coach coach;

    @Autowired
    public CoachController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Coach says: " + coach.getFortuneMessage();
    }
}
