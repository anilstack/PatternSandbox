package com.patternsandbox.anilstack.creational.starter;

import com.patternsandbox.anilstack.creational.helper.Notification;
import com.patternsandbox.anilstack.creational.pattern.NotificationFactory;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class FactoryPatternDemo {

    public static void main(String[] args) throws Exception {
        Notification notification = NotificationFactory.getNotification("email");
        notification.notifyUser();
    }

}
