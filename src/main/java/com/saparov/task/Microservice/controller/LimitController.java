package com.saparov.task.Microservice.controller;

import com.saparov.task.Microservice.service.LimitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitController {
	private final LimitService limitService;
}
