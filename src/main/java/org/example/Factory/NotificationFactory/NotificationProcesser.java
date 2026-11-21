package org.example.Factory.NotificationFactory;

public abstract class NotificationProcesser {

    public abstract INotification create();

    public void sendNotification() {
        INotification iNotification = create();
        iNotification.notification();
    }
}
