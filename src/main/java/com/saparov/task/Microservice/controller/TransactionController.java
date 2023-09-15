package com.saparov.task.Microservice.controller;

import com.saparov.task.Microservice.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TransactionController {
	private final TransactionService transactionService;
}
