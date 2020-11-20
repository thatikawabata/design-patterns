package br.com.designPatterns.strategy.imposto;

public class ICMS implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.1;
    }
}
