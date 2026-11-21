package org.example.Factory.NotificationFactory;

public class PushNotification implements INotification{
    @Override
    public void notification() {
        System.out.println("PushNotification.notification");
    }
}
