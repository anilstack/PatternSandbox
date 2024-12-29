package com.patternsandbox.anilstack.creational.starter;

import com.patternsandbox.anilstack.creational.helper.impl.EmailNotificationCreator;
import com.patternsandbox.anilstack.creational.helper.impl.SMSNotificationCreator;
import com.patternsandbox.anilstack.creational.helper.impl.WhatsAppNotificationCreator;
import com.patternsandbox.anilstack.creational.pattern.NotificationFactory;
import com.patternsandbox.anilstack.creational.pattern.NotificationFactoryMethod;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        NotificationFactoryMethod notificationFactoryMethod = new EmailNotificationCreator();
        notificationFactoryMethod.notifiy();

        NotificationFactoryMethod smsNotificationFactoryMethod = new SMSNotificationCreator();
        smsNotificationFactoryMethod.notifiy();

        NotificationFactoryMethod whatsAppNotificationFactoryMethod = new WhatsAppNotificationCreator();
        whatsAppNotificationFactoryMethod.notifiy();
    }

}
