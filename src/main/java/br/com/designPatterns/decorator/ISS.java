package br.com.designPatterns.decorator;


public class ISS extends Tax {
    public ISS(Tax outroTax){
        super(outroTax);
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.06 + calculationOfTheOtherTax(budget);
    }

}
