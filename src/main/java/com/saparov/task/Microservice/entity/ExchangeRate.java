package com.saparov.task.Microservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "exchange_rates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "currency_pair")
	private String currencyPair;
	
	@Column(name = "exchange_rate")
	private BigDecimal exchangeRate;
	
	@Column(name = "date")
	private LocalDate date;
}
