package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.pattern.OrderServiceFacade;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        OrderServiceFacade orderService = new OrderServiceFacade();
        orderService.placeOrder("Laptop", 3, "CreditCard12345");
    }

}
