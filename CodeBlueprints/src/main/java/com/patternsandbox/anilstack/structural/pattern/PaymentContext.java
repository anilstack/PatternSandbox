package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.PaymentState;
import com.patternsandbox.anilstack.structural.helper.impl.InitializedState;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * State Pattern, the key concept is that the behavior of an object changes based on its internal state.
 * The state object handles the logic for the specific state of the context and transitions it to the next state.
 *
 *
 */
public class PaymentContext {

    private PaymentState currentState;

    public PaymentContext() {
        this.currentState = new InitializedState();
    }

    public void setState(PaymentState state) {
        this.currentState = state;
    }

    public void process() {
        currentState.processPayment(this);
    }


}
