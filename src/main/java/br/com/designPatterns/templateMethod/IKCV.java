package br.com.designPatterns.templateMethod;

public class IKCV extends TemplateConditionalTax {

    private boolean hasItemGreaterTha100(Budget budget) {
        for(Item item : budget.getItems()) {
            if(item.getValue() > 100)
            return true;
        }
        return false;
    }

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    public boolean shouldUseMaxTax(Budget budget) {
        return budget.getValue() > 500 && hasItemGreaterTha100(budget);
    }
}
