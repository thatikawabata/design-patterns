package br.com.designPatterns.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {

    private String companyName;
    private String registration;
    private List<ReceiptItem> allItems = new ArrayList<ReceiptItem>();
    private double grossValue;
    private double taxes;
    private String observation;
    private LocalDateTime dateOfIssue;

    public ReceiptBuilder forCompany(String companyName){
        this.companyName = companyName;
        return this;
    }

    public ReceiptBuilder withRegistration(String registration){
        this.registration = registration;
        return this;
    }

    public ReceiptBuilder withItems(ReceiptItem item){
        allItems.add(item);
        grossValue += item.getValue();
        taxes += item.getValue() * 0.05;
        return this;
    }

    public ReceiptBuilder withObservation(String observation){
        this.observation = observation;
        return this;
    }

    public ReceiptBuilder nowDate(){
        this.dateOfIssue = LocalDateTime.now();
        return this;
    }

    public Receipt build(){
        return new Receipt(companyName, registration, dateOfIssue, grossValue, taxes, allItems, observation);
    }
}
