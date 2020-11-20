package br.com.designPatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReceiptItem {

    private String name;
    private double value;

}
