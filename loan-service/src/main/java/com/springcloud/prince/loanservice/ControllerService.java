package com.springcloud.prince.loanservice;

import com.netflix.discovery.converters.Auto;
import com.springcloud.prince.loanservice.entity.HomeLoans;
import com.springcloud.prince.loanservice.entity.PersonalLoans;
import com.springcloud.prince.loanservice.repository.HomeloanRepository;
import com.springcloud.prince.loanservice.repository.PersonalloanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerService {

    @Autowired
    private PersonalloanRepository personalloanRepository;

    @Autowired
    private HomeloanRepository homeloanRepository;

    @Autowired
    private Environment environment;

    @GetMapping("/personalloans")
    public List<PersonalLoans> getPersonalLoans() {

        System.out.println(" >>>>>>>>>>>>>>>>>Port called is personal  >>>>>>"+ environment.getProperty("local.server.port"));
        return personalloanRepository.findAll();
    }

    @GetMapping("/homeloans")
    public List<HomeLoans> getHomeLoans() {

        System.out.println(" >>>>>>>>>>>>>>>>>Port called is  >>>>>>"+ environment.getProperty("local.server.port"));
        return homeloanRepository.findAll();
    }
}
