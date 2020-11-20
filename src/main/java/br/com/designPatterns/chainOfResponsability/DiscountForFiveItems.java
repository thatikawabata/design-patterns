package br.com.designPatterns.chainOfResponsability;

public class DiscountForFiveItems implements Discount {

    private Discount next;

    @Override
    public double discount(Budget budget){
        if(budget.getItems().size() > 5){
            return budget.getValue() * 0.1;
        }
        return next.discount(budget);
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
