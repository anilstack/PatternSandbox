package com.patternsandbox.anilstack.creational.pattern;

import com.patternsandbox.anilstack.creational.helper.Notification;
import com.patternsandbox.anilstack.creational.helper.impl.EmailNotification;
import com.patternsandbox.anilstack.creational.helper.impl.SMSNotification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class NotificationFactory {

    public static Notification getNotification(String notificationType) throws Exception {

        if (notificationType==null) {
            throw new Exception("NotificationType Should Not Be Null");
        }

        switch (notificationType.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown Notification Type");
        }

    }

}
