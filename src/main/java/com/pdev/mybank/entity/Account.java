package com.pdev.mybank.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String agency;

    @Column(scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", scale = 2, precision = 13)
    private BigDecimal limit;
}
