package com.patternsandbox.anilstack.creational.pattern.impl;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;
import com.patternsandbox.anilstack.creational.helper.SMSNotification;
import com.patternsandbox.anilstack.creational.helper.impl.SendGridEmailNotification;
import com.patternsandbox.anilstack.creational.helper.impl.SendGridSMSNotification;
import com.patternsandbox.anilstack.creational.pattern.AbstractFactoryNotificationFactory;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class SendGridNotificationFactory implements AbstractFactoryNotificationFactory {
    @Override
    public EmailNotification createEmailNotification() {
        return new SendGridEmailNotification();
    }

    @Override
    public SMSNotification createSMSNotification() {
        return new SendGridSMSNotification();
    }
}
