package com.app.bank.ecea.service;

import com.app.bank.ecea.entity.BankEntity;
import com.app.bank.ecea.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BankEntityService {
    @Autowired
    BankAccountRepository bankAccountRepository;

    public BankEntity createAccount(BankEntity ba) {
        return bankAccountRepository.save(ba);
    }
    public List<BankEntity> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

    public BankEntity getBankAccount(Integer id) {
        return bankAccountRepository.findById(id).orElse(null);
    }

    public BankEntity updateBankAccount(Integer id, BankEntity bankEntity) {
        return bankAccountRepository.findById(id)
                .map(existingAccount -> {
                    existingAccount.setName(bankEntity.getName());
                    existingAccount.setAmount(bankEntity.getAmount());
                    return bankAccountRepository.save(existingAccount);
                })
                .orElse(null);
    }

    public boolean deleteBankAccount(Integer id) {
        if (!bankAccountRepository.existsById(id)) {
            return false;
        }
        bankAccountRepository.deleteById(id);
        return true;
    }
}
