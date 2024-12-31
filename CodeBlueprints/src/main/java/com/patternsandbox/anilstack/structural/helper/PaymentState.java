package com.patternsandbox.anilstack.structural.helper;

import com.patternsandbox.anilstack.structural.pattern.PaymentContext;

public interface PaymentState {

    void processPayment(PaymentContext context);

}
