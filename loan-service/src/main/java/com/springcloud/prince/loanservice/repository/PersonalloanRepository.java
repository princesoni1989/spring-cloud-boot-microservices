package com.springcloud.prince.loanservice.repository;

import com.springcloud.prince.loanservice.entity.PersonalLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalloanRepository extends JpaRepository<PersonalLoans, String>{
}
