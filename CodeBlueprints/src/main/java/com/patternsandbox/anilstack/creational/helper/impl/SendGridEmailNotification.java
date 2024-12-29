package com.patternsandbox.anilstack.creational.helper.impl;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class SendGridEmailNotification implements EmailNotification {
    @Override
    public void sendEmail(String message) {
        System.out.println("Sending SendGrid Email Notification To EndUser "+message);
    }
}
