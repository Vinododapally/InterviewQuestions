package com.java.programs;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int number= 12321;
        String name = "madam";
        if(number==isPalindrome(number)){
            System.out.println(" Given number is palindrome");
        } else {
            System.out.println("its not a palindrome");
        }

        if(name.equals(isPalindrome(name))){
            System.out.println(" Given String is palindrome");
        } else {
            System.out.println("string not a palindrome");
        }
    }

    static int isPalindrome(int number){
        int rev=0;
        while(number !=0){
            int remainder =number%10;
            rev= rev*10+remainder;
            number = number/10;
        }
        return  rev;
    }
    static String isPalindrome(String name){
        String newString= "";
        for (int i = 0; i < name.length(); i++) {
            char chars = name.charAt(i);
            newString = chars+newString;
        }
        return newString;
    }
}
