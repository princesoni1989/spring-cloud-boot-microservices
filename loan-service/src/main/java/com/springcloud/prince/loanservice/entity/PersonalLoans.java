package com.springcloud.prince.loanservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PersonalLoans {

    @Id
    private String id;

    private String types;

    private String interestRate;

    private int minimumAmount;

    public PersonalLoans(String id, String types, String interestRate, int minimumAmount) {
        this.id = id;
        this.types = types;
        this.interestRate = interestRate;
        this.minimumAmount = minimumAmount;
    }
}
