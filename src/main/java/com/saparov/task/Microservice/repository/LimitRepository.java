package com.saparov.task.Microservice.repository;

import com.saparov.task.Microservice.entity.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LimitRepository extends JpaRepository<Limit, Long> {
	Optional<Limit> findByClientAccountId(Long clientId);
}
