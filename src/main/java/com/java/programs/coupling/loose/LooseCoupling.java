package com.java.programs.coupling.loose;

public class LooseCoupling {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setV(new Car()); // Inject Car dependency
        traveler.startJourney(); // start journey by Car
        traveler.setV(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike

        // for more info refer this: https://www.javaguides.net/2018/08/coupling-in-java-with-example.html
    }
}
