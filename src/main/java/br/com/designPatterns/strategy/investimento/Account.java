package br.com.designPatterns.strategy.investimento;

import lombok.Getter;

public class Account {
    @Getter
    private double balance;

    public void deposit(double value){
        this.balance += value;
    }

}
