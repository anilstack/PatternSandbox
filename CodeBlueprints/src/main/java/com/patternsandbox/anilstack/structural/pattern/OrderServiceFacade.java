package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.impl.InventorySystem;
import com.patternsandbox.anilstack.structural.helper.impl.PaymentService;
import com.patternsandbox.anilstack.structural.helper.impl.ShippingSystem;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * Its primary goal is to simplify access to a complex sub systems.
 * Focuses on coordinating workflows or processes,(Orchestration) often involving multiple systems or components.
 */
public class OrderServiceFacade {

    private PaymentService paymentService;
    private InventorySystem inventorySystem;
    private ShippingSystem shippingSystem;

    public OrderServiceFacade() {
        this.paymentService = new PaymentService();
        this.inventorySystem = new InventorySystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void placeOrder(String item, int quantity, String paymentDetails) {

        if (inventorySystem.checkStock(item, quantity)) {
               if (paymentService.processPayment(paymentDetails)) {
                    inventorySystem.updateStock(item, quantity);
                    shippingSystem.arragneShipping(item, quantity);
               } else {
                   System.out.println("Payment Failed. Order Cannot Be Placed.");
               }
        } else {
            System.out.println("Insuffienct Stock. Order Cannot Be Placed To This Item: "+item);
        }


    }

}
