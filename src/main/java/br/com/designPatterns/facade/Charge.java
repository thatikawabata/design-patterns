package br.com.designPatterns.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Charge {

    private String type;
    private Invoice invoice;
}
