package br.com.designPatterns.state;

public class Approved implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= budget.value * 0.02;
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Orcamentos  ja aprovado");
    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Orcamentos em aprovacao nao podem para reprovado");
    }

    @Override
    public void finish(Budget budget) {
        budget.newState = new Finished();
    }
}
