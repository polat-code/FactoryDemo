package com.example.factorydemo;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User is notified by Email!");
    }
}
