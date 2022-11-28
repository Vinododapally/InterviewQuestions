package com.java.programs.coupling.tight;

public class TightCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();  // https://www.javaguides.net/2018/08/coupling-in-java-with-example.html

        // Here the tightCoupling class is highly depends on Car class, refer the above link
    }
}
