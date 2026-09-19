package com.app.bank.ecea.controller;
import com.app.bank.ecea.service.BankEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.bank.ecea.entity.BankEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/bank")
public class BankEntityController {
    @Autowired
    BankEntityService bankEntityService;
    @PostMapping("/create")
    public ResponseEntity<BankEntity> BankAccount(@RequestBody BankEntity ba) {
        bankEntityService.createAccount(ba);
        return new ResponseEntity<>(ba, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<BankEntity> getBankAccount(@PathVariable Integer id) {
        BankEntity bankEntity = bankEntityService.getBankAccount(id);
        if (bankEntity != null) {
            return new ResponseEntity<>(bankEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping ("/update/{id}")
    public ResponseEntity<BankEntity> updateBankAccount(@PathVariable Integer id, @RequestBody BankEntity bankEntity) {
        BankEntity updatedBankEntity = bankEntityService.updateBankAccount(id, bankEntity);
        if (updatedBankEntity != null) {
            return new ResponseEntity<>(updatedBankEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBankAccount(@PathVariable Integer id) {
        boolean deleted = bankEntityService.deleteBankAccount(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
