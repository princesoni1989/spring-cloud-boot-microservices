package com.springcloud.prince.homeloanservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeloanController {

    @Autowired
    private LoanServiceProxy loanServiceProxy;

    @GetMapping("/homeloan-service")
    public List<HomeLoans> getHomeLoans(){
        List<HomeLoans> response = loanServiceProxy.getHomeLoansProxy();
        return response;
    }
}
