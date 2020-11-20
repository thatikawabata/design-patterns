package br.com.designPatterns.facade;

public class ClientDao {

    public Client findByCpf(String cpf){
        //return client by cpf, for example I return client Maria with cpf = 12345678900
        return new Client("Maria", "12345678900");
    }
}
