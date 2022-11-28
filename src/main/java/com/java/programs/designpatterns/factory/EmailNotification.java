package com.java.programs.designpatterns.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("From Email Notification--->");
    }
}
