package br.com.designPatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Tax {

    protected Tax anotherTax;

    public abstract double calculate(Budget budget);

    protected double calculationOfTheOtherTax(Budget budget){
        if(anotherTax == null) return 0;
        return anotherTax.calculate(budget);
    }
}
