package br.com.designPatterns.observer;

public class ReceiptDao implements ActionAfterGeneratingReceipt {

    public void execute(Receipt receipt) {
        System.out.println("Salvou no banco de dados");
    }

}
