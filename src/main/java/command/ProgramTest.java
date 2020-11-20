package command;

public class ProgramTest {

    public static void main(String[] args) {
        /*
        * Temos uma fila de comandos a serem executados para
        * diferentes pedidos.
        * Para isso usamos o padrão de projeto Command que
        * separa os comandos que serão executados do objeto
        * que ele pertence.
        *
        * "COMMAND: Encapsula uma solicitação como um objeto"
        *
        */


        var o1 = new Order("Thatiane", 150.0);
        var o2 = new Order("Andre", 350.0);

        var queue = new Queue();
        queue.add(new PayOrder(o1));
        queue.add(new PayOrder(o2));
        queue.add(new CompleteOrder(o1));

        queue.process();

    }

}
