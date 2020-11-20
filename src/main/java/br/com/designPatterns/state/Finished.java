package br.com.designPatterns.state;

public class Finished implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        throw new RuntimeException("Não aplica desconto");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Orcamentos ja finalizado");
    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Orcamentos ja finalizado");
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("Orcamentos ja finalizado");
    }
}
