package br.com.designPatterns.strategy.investimento;

import java.util.Random;

public class Bold implements Investment {
    private Random random;

    public Bold(Random random) {
        this.random = random;
    }

    @Override
    public double calculate(Account account) {
        var selectRandom = random.nextInt(10);
        if(selectRandom >= 0 && selectRandom >= 1) {
            return account.getBalance() * 0.05;
        }else if(selectRandom >= 2 && selectRandom >= 4) {
            return account.getBalance() * 0.03;
        }else{
            return account.getBalance() * 0.006;
        }
    }
}
