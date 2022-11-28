package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewQ {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2);
        Set set=new HashSet();
        System.out.println(" find max min and average number from the given list:");
        int maxValue = integerList.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Max value = "+maxValue);
        int minValue = integerList.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min Value = " + minValue);
        OptionalDouble avgValue = integerList.stream().mapToInt(Integer::intValue).average();
        System.out.println("Avg Value = " + avgValue);
        int sumValue = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum Value = " + sumValue);
        long count = integerList.stream().count();
        System.out.println("Count of given list = " + count);
        Integer integer= integerList.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
        System.out.println("Max number by using diff approach and this can be applied for all the above methods="+integer);
        System.out.println("Even numbers from the  given list::");
        integerList.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println("Odd numbers from the  given list::");
        integerList.stream().filter(n->n%2!=0).forEach(System.out::println);
        System.out.println("Ascending order from the  given list::");
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println("Descending order from the  given list::");
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        int firstValue= integerList.stream().findFirst().get();
        System.out.println("Find first value from the list = "+firstValue);
        int lastValue =integerList.stream().reduce((One,two)-> two).get();
        System.out.println("Find last value from the list = " +lastValue);
        int value= integerList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("we can do this way also to find t last value = " + value);
        System.out.println("Find the prime numbers from the list");
        integerList.stream().filter(InterviewQ::primeNumber).forEach(System.out::println);
        System.out.println("Remove the element from list using index of a given numbers = "+removeIndex(2));
        System.out.println("Get the element from the list using index number="+getIndex(2));
        System.out.println("Reverse of a number= "+palindrome(12342));
        System.out.println("Find the numbers starts with 1, from the list");
        integerList.stream().map(s->s+ "").filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("Remove duplicate numbers from the list");
        integerList.stream().filter(n->set.add(n)).forEach(System.out::println);
        System.out.println(" print Duplicate numbers from the list");
        Set duplicates=new HashSet();
        integerList.stream().filter(n->!duplicates.add(n)).forEach(System.out::println);
        System.out.println("Reverse the given string = "+reverse("Vinod"));
        System.out.println("Print key value pair of duplicate character");
        keyValue("ABCBBCD");
        System.out.println("Count of each word from the list");
        countEachWordFromTheList();
        System.out.println("Print middle of each character from the list of strings");
        printMiddleCharFromTheList();
        System.out.println("Print duplicate values from the comma separated string and we can do same for space and all the special chars ");
        duplicateWordsFrom("vinod,vinod,raj,nani,nani");
        List<Employee> employeeList = getList();
        System.out.println("Print array elements to upper case");
        String [] array = {"vinod","sai","hyd"};
        System.out.println(Stream.of(array).map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Print th total count of string");
        String words = "This is Vinod Odapally";
        String[] strings = words.split(" ");
        System.out.println( Arrays.stream(strings).count());
        Optional<Employee> employeeFirstObject = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getId)).findFirst();
        System.out.println("Find first object from the employee list = "+employeeFirstObject.get());
        Optional<Employee> employeeLastObject = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getId).reversed()).findFirst();
        System.out.println("Find last object from the employee list = "+employeeLastObject.get());
        Optional<Employee> employeeMinSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
        System.out.println("Find minimum salary object from the employee list = "+employeeMinSalary.get());
        Optional<Employee> employeeMaxSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
        System.out.println("Find maximum salary object from the employee list = "+employeeMaxSalary.get());
        List<Employee> employeeAscendingOrderWithSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(" Ascending order with salary object from the employee list = "+employeeAscendingOrderWithSalary);
        List<Employee> employeeDescendingOrderWithSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("Descending order with salary object from the employee list = "+employeeDescendingOrderWithSalary);
        List<Employee> employeeWithGreaterSalary = employeeList.stream().filter(employee -> employee.getSalary()>20000).collect(Collectors.toList());
        System.out.println("Find salary witch is greater then 20000 from the list = "+employeeWithGreaterSalary);
        System.out.println("Print the name of the employee witch is greater then the 20000");
        employeeList.stream().filter(employee -> employee.getSalary()>20000).map(Employee::getName).forEach(System.out::println);
        System.out.println("Print the name and id of the employee witch is greater then the 20000");
        employeeList.stream().filter(employee -> employee.getSalary()>20000).forEach(emp->System.out.println(emp.getName()+":"+emp.getId()));

        System.out.println("Merging of two arrays");
        Integer [] array1= {1,2,3};
        Integer [] array2= {4,5,6};
        Stream.of(array1,array2).flatMap(Stream::of).forEach(System.out::println);
        System.out.println("Merging of two Lists");
        String [] first={"Vinod","Raj"};
        String [] snd={"Vamshi","Mahesh"};
        List<String> lst1 = Arrays.asList(first);
        List<String> lst2 = Arrays.asList(snd);
        Stream.of(lst1,lst2).flatMap(Collection::stream).forEach(System.out::println);
        System.out.println("Count of string using Map:");
        countOfStringUsingMap();
    }

    static boolean primeNumber(int number){
        return !IntStream.rangeClosed(2,number/2).anyMatch(i->number%i==0);
    }

    static String removeIndex(int index){
        int [] array={1,2,3,4,5,6,7,8,9};
        return Arrays.toString(IntStream.range(0,array.length).filter(i->i!=index).map(i->array[i]).toArray());
    }

    static String getIndex(int index){
        int [] array={1,2,3,4,5,6,7,8,9};
        return Arrays.toString(IntStream.range(0,array.length).filter(i->i==index).map(i->array[i]).toArray());
    }

    static int palindrome(int number){
        int reverse = 0;
        while (number!=0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    static String reverse(String name){
        String newString="";
        char c;
        for (int i = 0; i < name.length(); i++) {
            c=name.charAt(i);
            newString=c+newString;
        }
        return newString;
    }

    static void keyValue(String value){
        System.out.println("Print duplicate char with count");
        char[] ch=value.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for (char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> maps: map.entrySet()){
            System.out.println(maps.getKey()+":"+maps.getValue());
        }
    }

    static void countEachWordFromTheList(){
        String [] strings={"Vinod","sai","manoj"};
        Map<String,Integer> map= new HashMap<>();
        for (String str:strings){
           char[] chars=str.toCharArray();
            int count=0;
           for (char cha:chars){
               count++;
           }
            System.out.println(str+"::"+count);
        }
    }
    static void printMiddleCharFromTheList(){
        String [] strings={"Vinod","sai","manoj"};
        for (String str:strings){
            int index= str.length()/2;
            char c=str.charAt(index);
            System.out.println(str+"::"+c);
        }
    }
    static void duplicateWordsFrom(String str){
        String[] strings = str.split(",");
        Map<String,Integer> map= new HashMap<>();
        for(String st: strings){
            if(map.containsKey(st)){
                map.put(st,map.get(st)+1);
            } else {
                map.put(st,1);
            }
        }
        for (Map.Entry<String,Integer> maps: map.entrySet()){
            System.out.println(maps.getKey()+":"+maps.getValue());
        }
    }

    static void countOfStringUsingMap(){
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

    static List<Employee> getList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100,"vinod","vindo@gmail.com",10000.0,22));
        list.add(new Employee(200,"raj","raj@gmail.com",20000.0,25));
        list.add(new Employee(300,"sai","sai@gmail.com",30000.0,27));
        list.add(new Employee(400,"manoj","manoj@gmail.com",4000.0,30));
        list.add(new Employee(500,"manoj","ravi@gmail.com",50000.0,29));
        return list;
    }
}
