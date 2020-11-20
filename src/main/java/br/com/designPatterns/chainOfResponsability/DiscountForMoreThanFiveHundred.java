package br.com.designPatterns.chainOfResponsability;

public class DiscountForMoreThanFiveHundred implements Discount {

    private Discount next;

    @Override
    public double discount(Budget budget) {
        if(budget.getValue() > 500.0){
            return budget.getValue() * 0.07;
        }
        return next.discount(budget);
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
