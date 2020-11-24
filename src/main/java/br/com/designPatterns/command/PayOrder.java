package br.com.designPatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayOrder implements Command{

    private Order order;

    @Override
    public void execute() {
        System.out.println("Pagando pedido do " + order.getClient());
        order.pay();
    }
}
