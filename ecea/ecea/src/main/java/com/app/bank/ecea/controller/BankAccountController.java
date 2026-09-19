
package com.app.bank.ecea.controller;

import com.app.bank.ecea.component.BankAccount;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController

public class BankAccountController
{
    @GetMapping("bankAccount")
    public ResponseEntity<BankAccount> getBankAccount() {
        BankAccount bankAcc = new BankAccount(1, "Ram", 1000);
        return new ResponseEntity<>(bankAcc, HttpStatus.OK);
    }

    @GetMapping("{id}/{name}/{amount}")
    public ResponseEntity<BankAccount> setBankAccount(@PathVariable("id") int id,
                                                      @PathVariable("name") String name,
                                                      @PathVariable("amount") int amount) {
        BankAccount bank = new BankAccount(id, name, amount);
        return new ResponseEntity<>(bank, HttpStatus.OK);
    }

    @GetMapping("query")
    public ResponseEntity<BankAccount> bankAccountQueery(@RequestParam("id") int id,
                                                         @RequestParam("name") String name,
                                                         @RequestParam("amount") int amount) {
        BankAccount bankAccount = new BankAccount(id, name, amount);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount ba) {
        System.out.println(ba.getId() + " " + ba.getName() + " " + ba.getAmount());
        return new ResponseEntity<>(ba, HttpStatus.OK);
    }
}