package br.com.designPatterns.chainOfResponsability;

public class DiscountCalculator {

    public double calculate(Budget budget){
        var d1 = new DiscountForFiveItems();
        var d2 = new DiscountForMoreThanFiveHundred();
        var d3 = new WithoutDiscount();

        d1.setNext(d2);
        d2.setNext(d3);

        return d1.discount(budget);
    }
}
