package br.com.designPatterns.facade;

public class ClientFacade {

    public Client findClient(String cpf){
        System.out.println("Busca cliente por cpf");
        return new ClientDao().findByCpf(cpf);
    }

    public Invoice createInvoice(Client client, double value) {
        System.out.println("Cria fatura para o cliente");
        return new Invoice(client, 5000.0);
    }

    public Charge createCharge(String type, Invoice invoice) {
        System.out.println("Cria a cobrança");
       return new Charge("Boleto", invoice);
    }

}
