package com.patternsandbox.anilstack.creational.pattern.impl;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;
import com.patternsandbox.anilstack.creational.helper.SMSNotification;
import com.patternsandbox.anilstack.creational.helper.impl.TwilioEmailNotification;
import com.patternsandbox.anilstack.creational.helper.impl.TwilioSMSNotification;
import com.patternsandbox.anilstack.creational.pattern.AbstractFactoryNotificationFactory;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class TwilioNotificationFactory implements AbstractFactoryNotificationFactory {
    @Override
    public EmailNotification createEmailNotification() {
        return new TwilioEmailNotification();
    }

    @Override
    public SMSNotification createSMSNotification() {
        return new TwilioSMSNotification();
    }
}
