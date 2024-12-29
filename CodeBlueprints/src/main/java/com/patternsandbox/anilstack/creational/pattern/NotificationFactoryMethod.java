package com.patternsandbox.anilstack.creational.pattern;

import com.patternsandbox.anilstack.creational.helper.Notification;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 *
 * Lets objects creation  logic will handle by subclass  instead of keeping in one place in factory pattern bocz
 * we are voilating the open closed principle in factory pattern so if we want to add any new notification type
 * we need to modify factory this  is against to Open Closed Principle.
 *
 * In this if we want to add any new type of notification easily  we can add bcoz we are not centraliszed the object creation logic
 * like factory pattern it is handled by subclass so just create a new class which u want to send a notification and create a
 * factoryMethodPattern for object creation part and send notification. here code is open for extension  and closed for modification
 * which is nothing  but Open Closed Principle in SOLID.
 *
 *
 */
public abstract class NotificationFactoryMethod {


    public abstract Notification createNotification();

    public void notifiy() {
        Notification notification = createNotification();
        notification.notifyUser();
    }

}
