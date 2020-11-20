package br.com.designPatterns.state;

public class Reproved implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        throw new RuntimeException("Não aplica desconto");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Orcamentos reprovado naoo pode ser aprovado");
    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Orcamentos ja reprovado");
    }

    @Override
    public void finish(Budget budget) {
        budget.newState = new Finished();
    }
}
