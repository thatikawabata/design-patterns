package br.com.designPatterns.strategy.investimento;

public class InvestmentTest {

    public static void main(String[] args) {
        var conservative = new Conservative();

        var account = new Account();
        account.deposit(100);

        ApplyInvestment applyInvestment = new ApplyInvestment();
        applyInvestment.realizaInvestimento(account, conservative);
    }
}
