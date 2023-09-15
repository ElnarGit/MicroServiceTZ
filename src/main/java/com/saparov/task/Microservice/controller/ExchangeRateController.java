package com.saparov.task.Microservice.controller;

import com.saparov.task.Microservice.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExchangeRateController {
	private final ExchangeRateService exchangeRateService;
}
