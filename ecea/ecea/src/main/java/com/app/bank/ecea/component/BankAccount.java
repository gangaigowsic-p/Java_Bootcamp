package com.app.bank.ecea.component;

import org.springframework.stereotype.Component;

@Component

public class BankAccount {
    private int id;
    private String name;
    private int amount;

    public BankAccount(int id, String ram, int i) {
    }

    public   BankAccount()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BankAccount(int id) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
