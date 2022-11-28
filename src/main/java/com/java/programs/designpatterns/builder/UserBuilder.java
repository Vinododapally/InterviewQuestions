package com.java.programs.designpatterns.builder;

public class UserBuilder    {

     final String firstName;
     String lastName;
     int age;
     String phone;
     String address;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder age(int age){
        this.age=age;
        return this;
    }
    public UserBuilder phone(String phone){
        this.phone=phone;
        return this;
    }

    public UserBuilder address(String address){
        this.address=address;
        return this;
    }

}
