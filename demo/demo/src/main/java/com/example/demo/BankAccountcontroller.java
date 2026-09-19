package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountcontroller {

    @GetMapping("/bankaccount")
    public ResponseEntity<BankAccount> getBankAccount() 
    {

        BankAccount bankAccount = new BankAccount(1, "Ram", 1000);
        
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    
    }
}


