package com.app.bank.ecea.repository;

import com.app.bank.ecea.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankAccountRepository extends JpaRepository<BankEntity,Integer> {


}
