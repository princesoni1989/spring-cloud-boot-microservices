package com.springcloud.prince.loanservice.repository;

import com.springcloud.prince.loanservice.entity.HomeLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeloanRepository extends JpaRepository<HomeLoans , String>{
}
