package com.patternsandbox.anilstack.creational.helper.impl;

import com.patternsandbox.anilstack.creational.helper.Notification;
import com.patternsandbox.anilstack.creational.pattern.NotificationFactoryMethod;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class WhatsAppNotificationCreator extends NotificationFactoryMethod {
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
