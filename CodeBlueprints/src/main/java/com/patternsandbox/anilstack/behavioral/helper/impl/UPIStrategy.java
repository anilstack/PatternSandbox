package com.patternsandbox.anilstack.behavioral.helper.impl;

import com.patternsandbox.anilstack.behavioral.helper.PaymentStrategy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class UPIStrategy implements PaymentStrategy {

    private String upiId;

    public UPIStrategy(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI: "+upiId);
    }
}
