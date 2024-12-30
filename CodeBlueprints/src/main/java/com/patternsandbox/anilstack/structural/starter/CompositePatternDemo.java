package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.helper.impl.MenuItem;
import com.patternsandbox.anilstack.structural.pattern.MenuComposite;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class CompositePatternDemo {

    public static void main(String[] args) {

        //create a individual menu
        MenuItem burger = new MenuItem("burger",15);
        MenuItem fries = new MenuItem("fries", 10);
        MenuItem drink = new MenuItem("drink", 12);
        MenuItem iceCream = new MenuItem("iceCream", 14);

        //create a combo menu
        MenuComposite combo = new MenuComposite("Burger Combo");
        combo.add(burger);
        combo.add(fries);
        combo.add(drink);

        //create a main menu
        MenuComposite mainMenu = new MenuComposite("Main Menu");
        mainMenu.add(combo);       //combo
        mainMenu.add(iceCream);    //individual

        mainMenu.showDetails();
        System.out.println("Total Price: $"+mainMenu.getPrice());

    }


}
