package br.com.designPatterns.templateMethod;

public abstract class TemplateConditionalTax implements Tax {

    @Override
    public double calculate(Budget budget) {
        if(shouldUseMaxTax(budget)){
            return maxTax(budget);
        }
        return minTax(budget);
    }

    public abstract double minTax(Budget budget) ;

    public abstract double maxTax(Budget budget);

    public abstract boolean shouldUseMaxTax(Budget budget);
}
