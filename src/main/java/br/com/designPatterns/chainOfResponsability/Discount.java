package br.com.designPatterns.chainOfResponsability;

public interface Discount {

    double discount(Budget budget);

    void setNext(Discount next);
}
