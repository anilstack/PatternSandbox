package com.patternsandbox.anilstack.structural.helper.impl;

import com.patternsandbox.anilstack.structural.helper.PaymentState;
import com.patternsandbox.anilstack.structural.pattern.PaymentContext;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class NotificationState implements PaymentState {
    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("Payment Notification Sent.");
    }
}
