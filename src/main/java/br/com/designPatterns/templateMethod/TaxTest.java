package br.com.designPatterns.templateMethod;

public class TaxTest {

    public static void main(String[] args) {
        /*
         *
         *  Temos vários impostos ICMS, ISS, ICPP, IKCV ... porém eles podem ser muito parecidos
         *  Criamos uma classe abstrata (TemplateConditionalTax) para que cada imposto implemente cada um dos métodos
         *
         *  "TEMPLATE METHOD: Define o esqueleto de um algoritmo dentro de um método, transferindo
         *   alguns de seus passos para as subclasses. O template methodd permite que as subclasses
         *   redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo."
         */

        var ikcv = new IKCV();
        var icpp = new ICPP();

        var budget = new Budget(500.0);

        System.out.println(ikcv.calculate(budget));
        System.out.println(icpp.calculate(budget));
    }
}
