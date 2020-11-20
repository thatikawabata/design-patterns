package br.com.designPatterns.chainOfResponsability;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {
    @Getter
    private final double value;
    private final List<Item> items;

    public Budget(double value) {
        this.value = value;
        items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item){
        items.add(item);
    }

}
