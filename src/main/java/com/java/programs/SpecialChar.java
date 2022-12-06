package com.java.programs;

public class SpecialChar {

    public static void main(String[] args) {
        String str = "Vinod@0479@";
        int count = 0;
        String str1 ="";
        for (int i = 0; i <str.length() ; i++) {
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))){
                System.out.println("only special characters "+str.charAt(i));
                count++;
            } else {
                str1=str1+str.charAt(i);
            }
        }
        System.out.println("Count of special characters "+count);
        System.out.println("Count of special characters "+str1);
        if(isRotation()){
            System.out.println("rotation string found");
        }else {
            System.out.println("not the rotation of string");
        }

    }

    static boolean isRotation(){
        String str1 = "ABCD";
        String str2 = "CDAB";
        boolean b = (str1 + str1).indexOf(str2) != -1;
        return (str1.length() == str2.length()) &&((str1+str1).indexOf(str2)!=-1);
    }
}
