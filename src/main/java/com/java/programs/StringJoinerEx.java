package com.java.programs;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        StringJoiner joiner =  new StringJoiner(",","{","}"); // here u can use anything to combine the strings.
        joiner.add("Vinod").add("Sai");
        System.out.println("Joining both the strings "+joiner);
        int [] array1 = {10,20,30,40};
        int [] array2 = {50,20,30,60};
        System.out.println("print duplicate values in both array's");
        interSection(array1,array2);
        System.out.println("print both array's without duplicates");
        union(array1,array2);
    }

    static void interSection(int [] array1,int [] array2){
        Set set =new HashSet<>();
        for (int i = 0; i < array1.length ; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < array2.length ; i++) {
            if (set.contains(array2[i])){
                System.out.println(array1[i]);
            }
        }
    }
    static void union(int [] array1,int [] array2){
        Set set =new HashSet<>();
        for (int i = 0; i < array1.length ; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < array2.length ; i++) {
           set.add(array2[i]);
        }
        System.out.println(set);
    }
}
