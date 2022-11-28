package com.java.programs;

public class ExceptionHandling {

//https://www.javatpoint.com/difference-between-throw-and-throws-in-java

    // Note based on the req just uncomment the code..

    public static void main(String[] args) {

        // this is for try catch

//        try{
//            int a=10;
//            int b=0;
//            int c=a/b;
//            System.out.println(c);
//
//        }catch (ArithmeticException e){ // we are handling the exception here, if not will get Arithmetic exp..
//            System.out.println("Exception details "+e.getMessage());
//        }

       // this if for throw

        ExceptionHandling obj = new ExceptionHandling();
//        obj.checkNum(-3);
//        System.out.println("Rest of the code..");
//
       System.out.println(obj.divideNum(45, 0));
    }

    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }

    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
}
