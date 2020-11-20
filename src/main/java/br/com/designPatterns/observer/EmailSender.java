package br.com.designPatterns.observer;

public class EmailSender implements ActionAfterGeneratingReceipt {

    public void execute(Receipt receipt) {
        System.out.println("Enviou email");
    }

}
