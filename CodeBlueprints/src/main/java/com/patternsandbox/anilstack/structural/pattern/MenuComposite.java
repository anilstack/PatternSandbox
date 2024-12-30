package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.MenuComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * Composite Pattern is best suited for scenarios where the problem or domain naturally follows a tree-like structure
 * such as a hierarchy of objects. This pattern enables you to treat both individual objects (leaves) and groups of objects (composites)
 * uniformly through a common interface.
 *
 */
public class MenuComposite implements MenuComponent {

    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public MenuComposite(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }
    @Override
    public void showDetails() {
        System.out.println("Menu: "+name);
        for(MenuComponent component:components) {
            component.showDetails();
        }
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }
}
