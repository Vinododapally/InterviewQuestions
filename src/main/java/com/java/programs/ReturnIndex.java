package com.java.programs;

import java.util.Arrays;

public class ReturnIndex {
    public static void main(String[] args) {
        Integer[] array = {2,3,4,9};
        System.out.println(Arrays.asList(array).indexOf(3));
        System.out.println(Arrays.binarySearch(array,9));
    }
}
