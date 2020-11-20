package br.com.designPatterns.facade;

public class ClientTest {

    public static void main(String[] args) {
        /*
        * Temos uma empresa que tem um sistema de faturamento, cobrança, contato ao cliente, etc
        * Uma classe precisa consumir todos esses serviços de uma vez, uma forma seria chamar todos sequencialmente,
        * para contornar esse problema usamos o padrão de projeto Facade, ele provê uma fachada para os serviços
        * disponibilizando uma interface única, sem precisar conhecer cada objeto.
        *
        * "FACADE: Simplifica a interface de um conjunto de classes"
        *
        * */

        var facade = new ClientFacade();
        var client = facade.findClient("12345678900");
        var invoice = facade.createInvoice(client,500.0);
        facade.createCharge("Boleto", invoice);

        //withou facade
        /*
        var cpf = "12345678900";
        var client = new ClientDao().findByCpf(cpf);

        var invoice = new Invoice(client, 5000.0);

        var charge = new Charge("Boleto", invoice);

        var contact = new ContactClient(client, charge);
        contact.dispara();
        */

    }
}
