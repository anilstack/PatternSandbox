package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.impl.OrderProcessor;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class DigitalOrderProcessor extends OrderProcessor {
    @Override
    protected void deliveryProduct() {
        System.out.println("Digital product delivered via email.");
    }
}
