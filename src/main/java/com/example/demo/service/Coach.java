package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Coach {
	private final FortuneService fortuneService;

	@Autowired
	public Coach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getFortuneMessage() {
		return fortuneService.getFortune();
	}
}