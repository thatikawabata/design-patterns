package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompleteOrder implements Command{

    private Order order;

    @Override
    public void execute() {
        System.out.println("Finalizando pedido do " + order.getClient());
        order.finish();
    }
}
