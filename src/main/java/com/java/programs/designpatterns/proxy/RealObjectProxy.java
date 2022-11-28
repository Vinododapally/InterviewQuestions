package com.java.programs.designpatterns.proxy;

public class RealObjectProxy extends RealObjectImpl{

    @Override
    public void doSomething() {
        System.out.println("Delegating work on real object");
        super.doSomething();
    }
}
