package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankEntity {
    @Id
    private int id;
    private String name;
    private int amount;

    public BankEntity(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public BankEntity() {

    }

    static int getId() {
        return id;
    }
}