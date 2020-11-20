package br.com.designPatterns.strategy.investimento;

public class ApplyInvestment {

    public void realizaInvestimento(Account account, Investment investment){
            var result = investment.calculate(account);
            account.deposit(result * 0.75);
            var tax = result * 0.25;
            System.out.println("Total da conta: " + account.getBalance() +" Imposto: " + tax);
    }

}
