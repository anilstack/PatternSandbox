package com.patternsandbox.anilstack.creational.helper.impl;

import com.patternsandbox.anilstack.creational.helper.Notification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMSNotification To EndUser");
    }
}
