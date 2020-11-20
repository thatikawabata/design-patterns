package br.com.designPatterns.strategy.imposto;

public class TaxCalculator {

    public void performCalculation(Budget budget, Tax anotherTax){

        var tax = anotherTax.calculate(budget);
        System.out.println(tax);
    }

}
