package org.example.Factory.NotificationFactory;

public class PushNotificationProcesser extends NotificationProcesser{
    @Override
    public INotification create() {
        return new PushNotification();
    }
}
