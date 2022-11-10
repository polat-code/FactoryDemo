package com.example.factorydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryDemoApplication.class, args);

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("eMaiL");
        notification.notifyUser();

    }

}
