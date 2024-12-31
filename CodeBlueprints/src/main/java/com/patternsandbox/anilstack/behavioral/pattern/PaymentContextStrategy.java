package com.patternsandbox.anilstack.behavioral.pattern;

import com.patternsandbox.anilstack.behavioral.helper.PaymentStrategy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * The Strategy Pattern enables selecting an algorithms behaviour at runtime. it defines a family of algorithms
 * encapsulates each one in a separate class, and makes inter changeable.
 * Complexity: The number of strategy classes can increase as more algorithms are added.
 * Overhead: Frequent changes in strategy might introduce performance overhead.
 *
 *
 */
public class PaymentContextStrategy {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) throw new IllegalArgumentException("Payment Strategy not set ");
        paymentStrategy.pay(amount);
    }


}
