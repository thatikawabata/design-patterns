package br.com.designPatterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
public class Receipt {

    private String companyName;
    private String registration;
    private LocalDateTime dateOfIssue;
    private double grossValue;
    private double taxes;
    private List<ReceiptItem> items;
    public String observation;

}
