package br.com.designPatterns.builder;

public class ReceiptTest {
    public static void main(String[] args) {
        /*
         *
         *  Temos a construção de uma Nota fiscal, caso criarmos na main pelo construtor
         *  a regra de criação do objeto fica espalhado pelo código e caso algum parâmetro
         *  opcional não seja passado, temos que criar um novo contrutor sem aquele parâmetro.
         *
         *  Dessa forma separaremos a lógica da criação desse objeto em uma classe que será
         *  responsável por receber os parâmetros e montar a Nota Fiscal.
         *
         *  "BUILDER: Encapsula a maneira como um objeto completo é construído.
         *   Permite a construção de objetos em um processo variável com múltiplas
         *   etapas. Oculta do cliente a representação interna do produto."
         *
         */

        var builder = new ReceiptBuilder();
        builder.forCompany("Razao Social")
            .withRegistration("123456879/01")
            .withItems(new ReceiptItem("Item 1", 200.0))
            .withItems(new ReceiptItem("Item 2", 300.0))
            .withItems(new ReceiptItem("Item 3", 400.0))
            .withObservation("lalalala")
            .nowDate();

        Receipt nf = builder.build();

        System.out.println(nf.getGrossValue());

        //Without Builder
        /*
        List<ReceiptItem> items = Arrays.asList(new ReceiptItem("Item 1", 200.0), new ReceiptItem("Item 2", 400.0));

        double valorTotal = 0;
        for(ReceiptItem item: items){
            valorTotal += item.getValue();
        }

        double impostos = valorTotal * 0.05;

        Receipt nf = new Receipt("Razao Social", "cnpj", LocalDateTime.now(), valorTotal, impostos, items, "obs");
        */

    }
}
