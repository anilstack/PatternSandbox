package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.pattern.PaymentContext;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class PaymentClinet {

    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        payment.process();
        payment.process();
        payment.process();


    }


}
