package com.java.programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class WaysToCreateObject {
    String newKeyword = "With new key word";
    String newInstance = "With instance fo class";
    String cons = "With constructor initialization";

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("ways to create a object in java");
        WaysToCreateObject finalClass= new WaysToCreateObject();
        System.out.println(finalClass.newKeyword);
        WaysToCreateObject cls = WaysToCreateObject.class.newInstance();
        System.out.println(cls.newInstance);
        Constructor<WaysToCreateObject> construct = WaysToCreateObject.class.getConstructor();
        WaysToCreateObject fclass=construct.newInstance();
        System.out.println(fclass.cons);
        try {
            Class.forName("Vinod");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            ex.getCause();
            ex.getException();
            ex.getMessage();
            ex.getStackTrace();
            ex.getSuppressed();
        }
    }
}
