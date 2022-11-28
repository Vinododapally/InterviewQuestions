package com.java.programs.coupling.loose;

public class Traveler {
    private Vehicle v;

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }
    public void startJourney() {
        v.move();
    }
}
