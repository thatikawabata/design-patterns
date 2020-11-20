package br.com.designPatterns.chainOfResponsability;

public class DiscountTest {

    public static void main(String[] args) {
        /*
         *
         *  Temos um orçamento que recebe um descconto dependendo do tipo de venda: mais que 5 itens (10%)
         *  se o valor da compra for maios que R$ 500,00 (7%) ...
         *  Porém quando um desconto é aplicado nenhuma mais deve ser, então se o primeiro desconto não for elegível
         *  tenta o segundo desconto e assim por diante, formando uma "cadeia/corrente"
         *
         *
         *  "CHAIN OF RESPONSABILITY: Desconecta o remetente da solicitação dos seus destinatários.
         *   Simplifica o objeto porque não precisa conhecer a estrutura da cadeia e nem manter
         *   referência direta aos seus membros. Permite acrescentar ou remover responsabilidades
         *   dinamicamente, alterando os membros ou a sequência da cadeia."
         *
         */

        var discounts = new DiscountCalculator();

        var budget = new Budget(600.0);
        budget.addItem(new Item("Caneta", 250.0));
        budget.addItem(new Item("Lapis", 350.0));

        var finalDiscount = discounts.calculate(budget);
        System.out.println(finalDiscount);
    }
}
