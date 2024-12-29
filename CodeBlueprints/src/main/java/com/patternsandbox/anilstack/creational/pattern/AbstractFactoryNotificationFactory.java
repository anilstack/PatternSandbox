package com.patternsandbox.anilstack.creational.pattern;

import com.patternsandbox.anilstack.creational.helper.EmailNotification;
import com.patternsandbox.anilstack.creational.helper.SMSNotification;

public interface AbstractFactoryNotificationFactory {

    EmailNotification createEmailNotification();
    SMSNotification createSMSNotification();


}
