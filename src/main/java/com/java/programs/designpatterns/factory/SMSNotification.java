package com.java.programs.designpatterns.factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("From SMS Notification--->");
    }
}
