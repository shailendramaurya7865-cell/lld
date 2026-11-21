package org.example.Factory.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationProcesser notificationProcesser = new EmailNotificationProcesser();
        notificationProcesser.sendNotification();
    }
}
