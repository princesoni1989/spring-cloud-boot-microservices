package com.springcloud.prince.homeloanservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class HomeLoans {

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
