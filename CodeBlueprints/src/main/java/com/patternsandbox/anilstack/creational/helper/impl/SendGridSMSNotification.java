package com.patternsandbox.anilstack.creational.helper.impl;

import com.patternsandbox.anilstack.creational.helper.SMSNotification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class SendGridSMSNotification implements SMSNotification {
    @Override
    public void sendSMS(String message) {
        System.out.println("Sending SMS via SendGrid: "+message);
    }
}
