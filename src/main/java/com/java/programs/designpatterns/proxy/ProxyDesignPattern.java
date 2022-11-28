package com.java.programs.designpatterns.proxy;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        RealObject realObject =  new RealObjectProxy();
        realObject.doSomething();
        // https://howtodoinjava.com/design-patterns/structural/proxy-design-pattern/
        //Proxy – hides the real object by extending it and clients communicate to real object via this proxy object.
        // Usually frameworks create this proxy object when client request for real object.
    }

}
