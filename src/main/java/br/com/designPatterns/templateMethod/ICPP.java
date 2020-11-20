package br.com.designPatterns.templateMethod;

public class ICPP extends TemplateConditionalTax {

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.05;
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.07;
    }

    @Override
    public boolean shouldUseMaxTax(Budget budget) {
        return budget.getValue() > 500;
    }
}
