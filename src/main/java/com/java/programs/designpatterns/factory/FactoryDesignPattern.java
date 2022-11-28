package com.java.programs.designpatterns.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        FactoryMethod factoryMethod= new FactoryMethod();
        factoryMethod.getNotification("SMS").notifyUser();
        //Factory Method Pattern allows the sub-classes to choose the type of objects to create.
        // It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.


    }
}
