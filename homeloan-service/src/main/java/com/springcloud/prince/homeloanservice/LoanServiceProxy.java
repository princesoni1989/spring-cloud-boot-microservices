package com.springcloud.prince.homeloanservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name = "loan-service")
public interface LoanServiceProxy {

    @GetMapping("/loan-service/homeloans")
    public List<HomeLoans> getHomeLoansProxy();

}
