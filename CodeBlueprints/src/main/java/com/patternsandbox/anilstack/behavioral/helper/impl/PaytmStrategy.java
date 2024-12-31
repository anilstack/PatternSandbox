package com.patternsandbox.anilstack.behavioral.helper.impl;

import com.patternsandbox.anilstack.behavioral.helper.PaymentStrategy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class PaytmStrategy implements PaymentStrategy {

    private String paytmId;

    public PaytmStrategy(String paytmId) {
        this.paytmId = paytmId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using paytm: "+paytmId);
    }
}
