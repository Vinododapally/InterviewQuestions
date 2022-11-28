package com.java.programs.designpatterns.factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("From Push Notification--->");
    }
}
