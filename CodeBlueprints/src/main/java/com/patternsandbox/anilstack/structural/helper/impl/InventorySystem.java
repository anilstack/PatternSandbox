package com.patternsandbox.anilstack.structural.helper.impl;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class InventorySystem {

    public boolean checkStock(String item, int quantity) {
        System.out.println("Checking Stock For Item: "+ item +", quantity: "+quantity);
        return true;
    }

    public void updateStock(String item, int quantity) {
        System.out.println("Updating Stock For Item: "+ item +", quantity: "+quantity);
    }

}
