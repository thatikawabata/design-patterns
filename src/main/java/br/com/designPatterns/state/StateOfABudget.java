package br.com.designPatterns.state;

public interface StateOfABudget {

    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);
    void disapprove(Budget budget);
    void finish(Budget budget);
}

