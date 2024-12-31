package com.patternsandbox.anilstack.behavioral.pattern;

import com.patternsandbox.anilstack.behavioral.helper.Observer;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 *  Used when you want to notify multiple objects (observers) about changes in the state of another object (subject).
 *
 *
 */
public class MobileAppObserver implements Observer {

    private String name;

    public MobileAppObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name +" Received from stockUpdate: "+ stockName + " is now $ "+price);
    }
}
