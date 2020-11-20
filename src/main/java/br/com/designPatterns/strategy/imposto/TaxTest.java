package br.com.designPatterns.strategy.imposto;

public class TaxTest {

    public static void main(String[] args) {
        /*
         *
         *  Temos vários impostos ICMS, ISS...
         *  Queremos calcular cada imposto de acordo com seu tipo (ICMS, ISS)
         *  Na classe TaxCalculator, criamos um método genérico que consegue realizar o cálculo
         *  para qualquer imposto sem a necessidade de fazer vários ifs dentro dele.
         *  Para isso criamos a interface Tax e fazemos as classes ICMS e ISS implementá-la
         *  Dessa forma recebemos um tipo mais genérico como parâmetro para ganharmos o polimorfismo
         *  na regra do cálculo
         *
         *  "STRATEGY: Define uma famímia de algoritmos, encapsula cada um deles e os torna
         *  intercambíveis."
         */


        var iss = new ISS();
        var icms = new ICMS();

        var budget = new Budget(500.0);

        var taxCalculator = new TaxCalculator();
        taxCalculator.performCalculation(budget, iss);
        taxCalculator.performCalculation(budget, icms);
    }
}
