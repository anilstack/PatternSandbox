package com.patternsandbox.anilstack.structural.helper.impl;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public abstract class OrderProcessor {

    public final void processOrder() {
        selectProduct();
        makePayment();
        deliveryProduct();
        sendConfirmation();
    }

    private void selectProduct() {
        System.out.println("Product Selected");
    }

    private void makePayment() {
        System.out.println("Payment processed");
    }

    protected abstract void deliveryProduct();

    protected void sendConfirmation() {
        System.out.println("Order Confirmation Sent.");
    }
}
