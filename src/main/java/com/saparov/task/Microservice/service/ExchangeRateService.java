package com.saparov.task.Microservice.service;

import com.saparov.task.Microservice.repository.ExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeRateService {
	private final ExchangeRateRepository exchangeRateRepository;
}
