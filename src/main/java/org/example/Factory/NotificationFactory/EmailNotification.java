package org.example.Factory.NotificationFactory;

public class EmailNotification implements INotification {
    @Override
    public void notification() {
        System.out.println("EmailNotification.notification");
    }
}
