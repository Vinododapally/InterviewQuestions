package com.java.programs;

import java.util.*;
import java.util.stream.Stream;

public class ArrayPrograms {
    public static void main(String[] args) {
        System.out.println("Make new array with sum of first and last elements of both arrays: ");
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] arr2 = new Integer[]{2, 2, 3, 4, 5};
        Integer[] arr3 = new Integer[arr1.length];
        // arr3 = Arrays.stream(arr2).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>();
        for (int j = arr2.length - 1; j >= 0; j--) {
            list.add(arr2[j]);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]+ list.get(i);
        }
        System.out.println(Arrays.toString(arr3));
        evenOdd();
    }
    static void evenOdd(){
        Integer [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("separate even and odd elements and print them in desc order");
        Integer [] even = Arrays.stream(array).filter(n->n%2==0).toArray(Integer[]::new);
        Integer [] odd = Arrays.stream(array).filter(n->n%2!=0).toArray(Integer[]::new);
        Arrays.sort(even,Collections.reverseOrder());
        Arrays.sort(odd,Collections.reverseOrder());
        Stream.of(even,odd).flatMap(Stream::of).forEach(System.out::println);
    }
}