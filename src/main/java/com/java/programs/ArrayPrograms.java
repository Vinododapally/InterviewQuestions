package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayPrograms {
    public static void main(String[] args) {
        System.out.println("Make new array with sum of first and last elements of both arrays: ");
        Integer [] arr1 = new Integer[] {1, 2, 3, 4, 5};
        Integer [] arr2 = new Integer [] {1, 2, 3, 4, 5};
        Integer [] arr3 ;
        arr3 = Arrays.stream(arr2).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i]+arr3[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
