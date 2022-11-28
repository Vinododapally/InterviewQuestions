package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Today {
    public static void main(String[] args) {

        String words = "This is a Programming Interview";
        Map<String, Integer> map = new HashMap<>();
        String[] strings = words.split(" ");

        for (String st : strings) {
            if(map.containsKey(st)){
                map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        System.out.println("Count of words from the String using map: "+map.size());
    }
}