package com.patternsandbox.anilstack.structural.helper.impl;

import com.patternsandbox.anilstack.structural.helper.MenuComponent;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class MenuItem implements MenuComponent {

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Item: "+name + " -  $"+price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
