package com.bootcoin.project.domain.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "account")
public class Account {
    @Id
    private String idAccount;
    private String documentNumber;
    private String documentType;
    private String phone;
    private String cardNumber;
    private String accountNumber;

    @Builder.Default
    private LocalDate date = LocalDate.now();

    @Builder.Default
    private Double balance = 0.0;

    
}
