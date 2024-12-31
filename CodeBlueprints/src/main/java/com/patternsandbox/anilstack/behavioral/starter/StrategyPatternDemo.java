package com.patternsandbox.anilstack.behavioral.starter;

import com.patternsandbox.anilstack.behavioral.helper.impl.CreditCardStrategy;
import com.patternsandbox.anilstack.behavioral.helper.impl.UPIStrategy;
import com.patternsandbox.anilstack.behavioral.pattern.PaymentContextStrategy;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContextStrategy paymentContext = new PaymentContextStrategy();
        paymentContext.setPaymentStrategy(new UPIStrategy("user@ybl.com"));
        paymentContext.executePayment(55.0);

        paymentContext.setPaymentStrategy(new CreditCardStrategy("1234-3212-7697-9878"));
        paymentContext.executePayment(250000);
    }

}
