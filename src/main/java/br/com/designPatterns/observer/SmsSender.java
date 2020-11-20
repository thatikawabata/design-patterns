package br.com.designPatterns.observer;

public class SmsSender implements ActionAfterGeneratingReceipt {

    public void execute(Receipt receipt) {
        System.out.println("Enviou SMS");
    }

}
