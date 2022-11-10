package com.example.factorydemo;

public class SmsNotification  implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User is notified by SMS!");
    }
}
