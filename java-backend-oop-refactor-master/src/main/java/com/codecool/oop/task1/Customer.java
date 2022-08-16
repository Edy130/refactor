package com.codecool.oop.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
abstract class Customer {
    private int id;
    private String name;
    private double moneySpentInLastMonth;
    private CustomerType type;
    abstract double calculateFee(Customer customer);
}

