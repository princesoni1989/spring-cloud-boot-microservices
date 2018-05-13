package com.springcloud.prince.loanservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class HomeLoans {

    @Id
    private String id;

    private String types;

    private String interestRate;

    private int minimumAmount;

    public HomeLoans(String id, String types, String interestRate, int minimumAmount) {
        this.id = id;
        this.types = types;
        this.interestRate = interestRate;
        this.minimumAmount = minimumAmount;
    }
}
