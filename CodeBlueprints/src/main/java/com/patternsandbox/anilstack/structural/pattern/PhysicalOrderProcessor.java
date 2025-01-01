package com.patternsandbox.anilstack.structural.pattern;

import com.patternsandbox.anilstack.structural.helper.impl.OrderProcessor;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * Template Pattern will use if you have common algorithm and only few steps will changes those will be
 * added by subclasses.
 */
public class PhysicalOrderProcessor extends OrderProcessor {
    @Override
    protected void deliveryProduct() {
        System.out.println("Physical product shipped to the address.");
    }


}
