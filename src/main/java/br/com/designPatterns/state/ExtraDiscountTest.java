package br.com.designPatterns.state;

public class ExtraDiscountTest {
    static class TesteDeImpostoComplexosTest {

        public static void main(String[] args) {
            /*
             *
             *  Temos um orçamento que pode estar com os seguintes status:
             *  Em aprovação, Aprovado, Reprovado e Finalizado.
             *  Para cada status um desconto extra pode ser aplicado: em aprovação(5%),
             *  aprovado(2%), reprovado e finalizado não recebem desconto.
             *  A troca de status também pode acontecer, porém caso seja uma mudança
             *  para um status inválido o troca não deve ser permitida.             *
             *
             *  "STATE:Permite que um objeto mude seu comportamento quando algum
             *   estado muda. Encapsula comportamentos baseados em estados e usa
             *   a delegação para alternar comportamentos. "
             *
             */


            var total = new Budget(500.0);

            total.applyExtraDiscount(total);

            System.out.println(total.getValue());

            total.approve();
            total.applyExtraDiscount(total);

            System.out.println(total.getValue());

            total.finish();

            total.approve();

        }
    }

}
