package br.com.designPatterns.observer;

public class ActionTest {
    public static void main(String[] args) {

        /*
         *
         *  Temos a Nota fiscal gerada, após isso ela é salva no banco, enviado
         *  por e-mail e SMS e impressa.
         *  Na classe ReceiptBuilder temos o método build que após a geração da nota
         *  chama as diversas ações (salvar, enviar e imprimir)
         *  Para resolver esse problema criamos uma interface que dispara a ação a ser
         *  executada. Dessa forma o método build não se importa quais ações serão executadas
         *  ela somente notifica essas ações.
         *
         *  "OBSERVER: Pemite notificar outros objetos quando ocorre uma mudança
         *  de estado"
         *
         */

        var builder = new ReceiptBuilder();
        builder.addAction(new EmailSender());
        builder.addAction(new ReceiptDao());
        builder.addAction(new SmsSender());
        builder.addAction(new Printer());

        var receipt = builder
            .forCompany("Razao Social")
            .withRegistration("123456879/01")
            .withItems(new ReceiptItem("Item 1", 200.0))
            .withItems(new ReceiptItem("Item 2", 300.0))
            .withItems(new ReceiptItem("Item 3", 400.0))
            .withObservation("lalalala")
            .nowDate()
            .build();

        System.out.println(receipt.getGrossValue());

    }
}
