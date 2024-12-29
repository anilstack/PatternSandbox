package com.patternsandbox.anilstack.creational.helper.impl;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class TwilioEmailNotification implements EmailNotification {
    @Override
    public void sendEmail(String message) {
        System.out.println("Sending SMS via Twilio: "+message);
    }
}
