package com.java.programs.coupling.loose;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
