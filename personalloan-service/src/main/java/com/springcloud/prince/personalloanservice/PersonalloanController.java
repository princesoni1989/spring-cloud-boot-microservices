package com.springcloud.prince.personalloanservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonalloanController {

    @Autowired
    private LoanServiceProxy loanServiceProxy;

    @GetMapping("/personalloan-service")
    public List<PersonalLoans> getHomeLoans(){
        List<PersonalLoans> response = loanServiceProxy.getHomeLoansProxy();
        return response;
    }
}
