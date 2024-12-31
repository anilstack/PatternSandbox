package com.patternsandbox.anilstack.behavioral.pattern;

import com.patternsandbox.anilstack.behavioral.helper.Observer;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class WebAppObserver implements Observer {

    private String name;

    public WebAppObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " Received from stockupdate: "+ stockName +" is now $ "+price);
    }
}
