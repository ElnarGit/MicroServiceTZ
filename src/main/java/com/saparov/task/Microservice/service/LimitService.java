package com.saparov.task.Microservice.service;

import com.saparov.task.Microservice.repository.LimitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LimitService {
	private final LimitRepository limitRepository;
	

}
