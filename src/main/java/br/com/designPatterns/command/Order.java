package br.com.designPatterns.command;


import lombok.Getter;

public class Order {
    @Getter
    private String client;
    private double value;
    private Status status;

    public Order(String client, double value) {
        this.client = client;
        this.value = value;
        this.status = Status.NEW;
    }

    public void pay(){
        status = Status.PAID;
    }

    public void finish(){
        status = Status.DELIVERED;
    }
}
