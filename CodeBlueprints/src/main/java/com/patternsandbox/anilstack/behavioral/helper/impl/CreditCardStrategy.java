package com.patternsandbox.anilstack.behavioral.helper.impl;

import com.patternsandbox.anilstack.behavioral.helper.PaymentStrategy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String creditCardNumber;

    public CreditCardStrategy(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using CreditCard: "+creditCardNumber);
    }
}
