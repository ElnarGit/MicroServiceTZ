package com.saparov.task.Microservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "limits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Limit {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "client_account_id")
	private Long clientAccountId;
	
	@Column(name = "month")
	private int month;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "limit_amount")
	private BigDecimal limitAmount;
	
	@Column(name = "limit_currency_short_name")
	private String limitCurrencyShortName;
	
	@Column(name = "limit_datetime")
	private LocalDate limitDatetime;

}
