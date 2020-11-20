package br.com.designPatterns.strategy.investimento;

public class Conservative implements Investment {

    @Override
    public double calculate(Account account) {
        return account.getBalance() * 0.008;
    }
}
