package br.com.designPatterns.chainOfResponsability;

public class WithoutDiscount implements Discount {

    @Override
    public double discount(Budget budget){
        return 0;
    }

    @Override
    public void setNext(Discount next) {
        //There is not next discount
    }
}
