package com.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.api.entity.Account;

public interface AccounntRepository  extends JpaRepository<Account, Long>{

}
