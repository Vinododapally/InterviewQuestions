package com.java.programs.designpatterns.factory;

public class FactoryMethod {
    public Notification getNotification(String notification) {
        switch (notification) {
            case "SMS":
                return new SMSNotification();
            case "Push":
                return new PushNotification();
            case "Email":
                return new EmailNotification();
        }
        return null;
    }
}
