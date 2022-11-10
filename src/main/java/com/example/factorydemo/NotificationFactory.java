package com.example.factorydemo;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if(channel == null || channel.isEmpty()){
            return null;
        }
        switch (channel.toLowerCase()) {
            case "sms":
                return new SmsNotification();

            case "push":
                return new PushNotification();

            case "email":
                return new EmailNotification();

            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }

    }

}
