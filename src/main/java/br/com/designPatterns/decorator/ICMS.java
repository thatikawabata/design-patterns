package br.com.designPatterns.decorator;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ICMS extends Tax {

    public ICMS(Tax anotherTax){
        super(anotherTax);
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.1 + calculationOfTheOtherTax(budget);
    }
}
