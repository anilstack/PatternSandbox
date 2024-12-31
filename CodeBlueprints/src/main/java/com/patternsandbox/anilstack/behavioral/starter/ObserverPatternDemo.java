package com.patternsandbox.anilstack.behavioral.starter;

import com.patternsandbox.anilstack.behavioral.helper.Observer;
import com.patternsandbox.anilstack.behavioral.helper.impl.Stockdata;
import com.patternsandbox.anilstack.behavioral.pattern.MobileAppObserver;
import com.patternsandbox.anilstack.behavioral.pattern.WebAppObserver;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Stockdata subject = new Stockdata();

        MobileAppObserver mobileAppObserver = new MobileAppObserver("mobileApp");
        WebAppObserver webAppObserver = new WebAppObserver("webApp");

        subject.registerObserver(mobileAppObserver);
        subject.registerObserver(webAppObserver);

        subject.setStockData("TATA STEEL", 150.58);
        subject.setStockData("HDFC BANK", 1289.12);

        subject.removeObserver(mobileAppObserver);

        subject.setStockData("AXIS BANK", 801.10);


    }

}
