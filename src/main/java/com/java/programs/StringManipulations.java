package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringManipulations {

    public static void main(String[] args) {
        String str = "Vinod";
        int n = str.length();
        int middle = str.length()/2;
        System.out.println("First letter of string = "+str.charAt(0));
        System.out.println("Last letter of string = "+str.charAt(n-1));
        System.out.println("Middle letter of string = "+str.charAt(middle));
        System.out.println("Count of string = "+str.length());
        System.out.println("To Uppercase = "+str.toUpperCase());
        System.out.println("To lower case = "+str.toLowerCase());
        reverseOfString(str);
        countOfFirstLetterFromArrayString();
    }

    static void reverseOfString(String name){
        String newString= "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            newString = c+ newString;
        }
        System.out.println("Reverse of a String = "+newString);
    }

    static void countOfFirstLetterFromArrayString(){
        Map<Character,Integer> map = new HashMap<>();
        String[] words = {"Vinod","Sai","Manoj","Varun"};
        String[] words1 = {"vinod","sai","manoj","varun"};
        for (int i=0;i< words.length;i++){            // Here we can use any index instead of 0
            if(map.containsKey(words[i].charAt(0))){
                map.put(words[i].charAt(0), map.get(words[i].charAt(0))+1);
            }else {
                map.put(words[i].charAt(0), 1);
            }
        }
        System.out.println("Count of first letter from the array string ");
        for (Map.Entry<Character,Integer> maps: map.entrySet()){
            System.out.println(maps.getKey()+"="+maps.getValue());

        }
        // using java8
        Arrays.stream(words).map(s->s.charAt(0)).forEach(System.out::println);
        Arrays.stream(words).map(s->s.charAt(0)).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((c,f)-> System.out.println(c+":"+f));

        String str = "Vinnodd";
        System.out.println("Duplicate char in string");
        //str.chars().mapToObj(c ->(char)  c).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((c,f)-> System.out.println(c+":"+f));

          Arrays.stream(words1).map(s->Character.toUpperCase(s.charAt(0))+s.substring(1)).forEach(System.out::println);
    }
}
