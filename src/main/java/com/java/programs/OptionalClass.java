package com.java.programs;

import java.util.Optional;

public class OptionalClass {


    public static void main(String[] args) {
        String[] str =  new String[10];   // for more details https://www.javatpoint.com/java-8-optional

        //optional(str); without optional class
        if(str[5]== null){
            System.out.println("null value is there==");
        }else{
            System.out.println("null value is there");
        }
        Optional<String> optionalS = Optional.ofNullable(str[5]);

        if(optionalS.isPresent()){
           optional(str);
        } else {
            System.out.println("no value present");
        }
    }

    static void optional(String[] s){
        String stringCase = s[5].toLowerCase();
       System.out.println(stringCase);
    }

}
