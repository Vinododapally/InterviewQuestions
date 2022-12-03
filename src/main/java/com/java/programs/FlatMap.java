package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  list2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        Stream.of(list1,list2).flatMap(List::stream).forEach(System.out::println);

        // u can find the more info here https://www.javatpoint.com/flatmap-method-in-java-8


        String words = "This is a Programming Interview";
        Map<String, Integer> map = new HashMap<>();
        String[] strings = words.split(" ");
        Arrays.stream(strings).count();
        System.out.println(Arrays.stream(strings).count());
    }
}
