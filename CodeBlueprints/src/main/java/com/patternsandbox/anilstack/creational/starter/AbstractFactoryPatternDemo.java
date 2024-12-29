package com.patternsandbox.anilstack.creational.starter;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;
import com.patternsandbox.anilstack.creational.helper.SMSNotification;
import com.patternsandbox.anilstack.creational.pattern.AbstractFactoryNotificationFactory;
import com.patternsandbox.anilstack.creational.pattern.impl.SendGridNotificationFactory;
import com.patternsandbox.anilstack.creational.pattern.impl.TwilioNotificationFactory;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class AbstractFactoryPatternDemo {
        private EmailNotification emailNotification;
        private SMSNotification smsNotification;

       public AbstractFactoryPatternDemo(AbstractFactoryNotificationFactory notificationFactory) {
            this.emailNotification = notificationFactory.createEmailNotification();
            this.smsNotification = notificationFactory.createSMSNotification();
        }

        public void sendAllNotification(String message) {
            emailNotification.sendEmail(message + " (Email)");
            smsNotification.sendSMS(message + " (Sms)");
        }


    public static void main(String[] args) {

        AbstractFactoryNotificationFactory sendGridNotificationFactory = new SendGridNotificationFactory();
        AbstractFactoryPatternDemo notificationService = new AbstractFactoryPatternDemo(sendGridNotificationFactory);
        notificationService.sendAllNotification("Notification via SendGrid");

        AbstractFactoryNotificationFactory twilioNotificationFactory = new TwilioNotificationFactory();
        AbstractFactoryPatternDemo twilioNotoficationService = new AbstractFactoryPatternDemo(twilioNotificationFactory);
        twilioNotoficationService.sendAllNotification("Notification via Twilio");
    }

}
