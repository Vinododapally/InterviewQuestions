package com.java.programs;

import java.util.*;

public class EnumerationIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vinod");
        list.add("Sai");
        list.add("Manoj");
        Enumeration<String> stringEnumeration = Collections.enumeration(list);
        while (stringEnumeration.hasMoreElements()){
            System.out.println("Value is: " + stringEnumeration.nextElement());
        }
        Enumeration<String> enumeration =  Collections.enumeration(getMap().values()); // same we can iterate keySet.
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

    static Map<Integer ,String> getMap(){
                Map<Integer ,String> mapList = new HashMap<>();
                mapList.put(1,"Vinod");
                mapList.put(2,"Manoj");
                return mapList;
    }
}
