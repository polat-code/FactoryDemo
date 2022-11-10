package com.example.factorydemo;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User is notified by Push");
    }
}
