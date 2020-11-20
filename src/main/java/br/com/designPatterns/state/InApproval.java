package br.com.designPatterns.state;

public class InApproval implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= budget.value * 0.05;
    }

    @Override
    public void approve(Budget budget) {
        budget.newState = new Approved();
    }

    @Override
    public void disapprove(Budget budget) {
        budget.newState = new Reproved();
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("Orcamentos em aprovacao nao podem ir direto para finalizado");
    }
}
