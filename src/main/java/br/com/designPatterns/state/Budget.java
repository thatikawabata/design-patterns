package br.com.designPatterns.state;

import br.com.designPatterns.templateMethod.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    @Getter
    protected double value;
    private final List<Item> items;

    protected StateOfABudget newState;

    public Budget(double value) {
        this.value = value;
        items = new ArrayList<Item>();
        newState = new InApproval();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void applyExtraDiscount(Budget budget) {
        newState.applyExtraDiscount(this);
    }

    public void approve(){
        newState.approve(this);
    }

    public void disapprove(){
        newState.disapprove(this);
    }

    public void finish(){
        newState.finish(this);
    }
}
