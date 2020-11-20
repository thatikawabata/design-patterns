package br.com.designPatterns.decorator;

public class ComplextTaxTest {
    static class TesteDeImpostoComplexosTest {

        public static void main(String[] args) {
            /*
             *
             *  Temos vários impostos ICMS, ISS... agora queremos criar impostos
             *  compostos ISS com ICMS ...
             *  Para não criar uma classe ISSComICMS utilizamos o padrão de projeto decorator
             *  Para isso, fazemos com que todos os impostos possam receber outros impostos, na
             *  Tax adicionamos o anotherTax e as classes filhas (ISS e ICMS) também terem
             *  os construtures, delegando para o construtor Tax
             *  Para calcular o imposto, basta criar o método da classe
             *  abstrata que chama o cálculo do outro imposto.
             *
             *  "DECORATOR: Envelopa um objeto para fornecer novos comportamentos, ou seja
             *   anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores
             *   fornecem uma alternativa flexível de subclasses para estender a funcionalidade."
             */

            var iss = new ISS(new ICMS());

            var budget = new Budget(500.0);

            var valor = iss.calculate(budget);

            System.out.println(valor);

        }
    }
}
