package com.codecool.oop.task1;

public class New extends Customer{
    public New(int id, String name, double moneySpentInLastMonth, CustomerType type){
        super(id, name, moneySpentInLastMonth, type);
        type = CustomerType.NEW;
    }
    @Override
    double calculateFee(Customer customer) {
        return 0;
    }
}
