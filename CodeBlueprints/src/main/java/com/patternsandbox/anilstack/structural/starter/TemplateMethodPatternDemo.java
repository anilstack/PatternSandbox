package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.helper.impl.OrderProcessor;
import com.patternsandbox.anilstack.structural.pattern.DigitalOrderProcessor;
import com.patternsandbox.anilstack.structural.pattern.PhysicalOrderProcessor;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class TemplateMethodPatternDemo {

    public static void main(String[] args) {

        OrderProcessor digitalOrderProcessor = new DigitalOrderProcessor();
        digitalOrderProcessor.processOrder();

        OrderProcessor physicalOrdereProcessor = new PhysicalOrderProcessor();
        physicalOrdereProcessor.processOrder();



    }


}
