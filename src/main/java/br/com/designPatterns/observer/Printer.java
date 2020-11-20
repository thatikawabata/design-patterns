package br.com.designPatterns.observer;

public class Printer implements ActionAfterGeneratingReceipt {

    public void execute(Receipt receipt) {
        System.out.println("Imprimiu");
    }}
