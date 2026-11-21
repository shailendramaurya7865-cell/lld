package org.example.Factory.NotificationFactory;

public class EmailNotificationProcesser extends NotificationProcesser{
    @Override
    public INotification create() {
        return new EmailNotification();
    }
}
