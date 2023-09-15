package com.saparov.task.Microservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_from")
    private String accountFrom;

    @Column(name = "account_to")
    private String accountTo;

    @Column(name = "currency_short_name")
    private String currencyShortName;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "expense_category")
    private String expenseCategory;

    @Column(name = "datetime")
    private LocalDateTime datetime;
    
    @Column(name = "limit_exceeded")
    private boolean limitExceeded;
}
