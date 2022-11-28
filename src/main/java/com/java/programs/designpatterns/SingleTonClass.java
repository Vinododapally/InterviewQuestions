package com.java.programs.designpatterns;

public class SingleTonClass {
    private static SingleTonClass singleTonClass = null;
    private SingleTonClass(){}

    public static SingleTonClass getSingleTonClass() {

        if(singleTonClass==null){
            singleTonClass= new SingleTonClass();
        } // use this for better understanding https://www.javatpoint.com/singleton-design-pattern-in-java
        return singleTonClass;
    }
}
