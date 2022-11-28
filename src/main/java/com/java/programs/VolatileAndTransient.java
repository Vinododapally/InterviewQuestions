package com.java.programs;

import java.io.Serializable;

class VolatileAndTransient  extends Thread implements Serializable {
    static volatile int age =20;
    String name = "Vinod";
    transient String email="Vinod@g2mail.com";
   volatile boolean isRunning=true;
     public void run() {
         long count=0;
         while (isRunning) {
             count++;
         }
         System.out.println("Thread terminated." + count);
     }
 // look for this for more info https://www.tutorialspoint.com/difference-between-volatile-and-transient-in-java
    public static void main(String[] args) throws InterruptedException {
      VolatileAndTransient volatileAndTransient= new VolatileAndTransient();
        System.out.println(volatileAndTransient.age);
        System.out.println(volatileAndTransient.name);
        System.out.println(volatileAndTransient.email);
        volatileAndTransient.start();
        Thread.sleep(2000);
        volatileAndTransient.isRunning = false;
        volatileAndTransient.join();
        System.out.println("isRunning set to " + volatileAndTransient.isRunning);
    }
}
