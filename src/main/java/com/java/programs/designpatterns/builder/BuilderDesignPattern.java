package com.java.programs.designpatterns.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        User user1 = new User(new UserBuilder("Vinod", "Odapally").age(27).address("hyd").phone("8801885124"));
        User user2 = new User(new UserBuilder("Vinod", "Odapally").phone("8801885124"));

        System.out.println(user1);
        System.out.println(user2);
        //Note: https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
        //It is used to construct a complex object step by step and the final step will return the object.
        // The process of constructing an object should be generic so that it can be used to create different representations of the same object.
    }
}
