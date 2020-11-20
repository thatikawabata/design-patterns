package br.com.designPatterns.strategy.investimento;

import java.util.Random;

public class Moderate implements Investment {
    private Random random;

    public Moderate(Random random) {
        this.random = random;
    }

    @Override
    public double calculate(Account account) {
        if(random.nextInt(2) == 0) {
            return account.getBalance() * 0.025;
        }else{
            return account.getBalance() * 0.007;
        }
    }
}
