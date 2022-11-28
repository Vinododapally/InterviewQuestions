package com.java.programs;

import com.java.programs.model.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class IterationOfListInDiffWays extends InterviewQ {

    public static void main(String[] args) {

        //https://javaconceptoftheday.com/iterating-an-arraylist-in-java/#:~:text=You%20can%20iterate%20a%20given%20ArrayList%20in%204%20different%20ways.
        // 1. Using for loop...
        System.out.println("Normal for loop started....");
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
        // 2. Using advanced for loop...
        System.out.println("Advanced for loop started....");
        for (Employee emp:getList()) {
            System.out.println(emp.getName()+"::"+emp.getId());
        }
        // . Using while loop..
        System.out.println("While loop started....");
        Iterator<Employee> employeeIterator = getList().iterator();
        while (employeeIterator.hasNext()){
            Employee e = employeeIterator.next();
            System.out.println(e.getId()+":"+e.getName());
        }
         // list iterator
        System.out.println("ListIterator loop started....");
        ListIterator<Employee> listIterator=getList().listIterator();
        while (listIterator.hasNext()){
            Employee e = listIterator.next();
            System.out.println(e.getId()+":"+e.getName());
        }
         // An Iterator is an interface in Java and we can traverse the elements of a list in a forward direction whereas a ListIterator is an
        // interface that extends the Iterator interface and we can traverse the elements in both forward and backward directions.
        // Map Iteration starts here:
        // Note: https://www.codingame.com/playgrounds/6162/6-ways-to-iterate-or-loop-a-map-in-java

        System.out.println("For loop using entrySet started....");
        for (Map.Entry<String,Employee> maps: getMap().entrySet()){
            System.out.println(maps.getKey()+":"+maps.getValue());
        }
        System.out.println("For loo using keySet started....");
        for (String maps: getMap().keySet()){
            System.out.println(maps);
            System.out.println(getMap().get(maps));
        }
        System.out.println("For loo using keyValue started....");
        for (Employee maps: getMap().values()){
            System.out.println(maps);
        }
        System.out.println("While loo using entrySet started....");
        Iterator<Map.Entry<String,Employee>> itr = getMap().entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry maps= itr.next();
            System.out.println(maps.getKey()+":"+maps.getValue());
        }

        // using java 8
        System.out.println("Java foreach loop using entrySet started....");
        getMap().forEach((id,name)-> System.out.println(id+"="+name));
        System.out.println("Java streams foreach loop using entrySet started....");
        getMap().entrySet().forEach(e-> System.out.println(e.getKey()+":=:"+e.getValue()));
        System.out.println("Java streams foreach loop using keyset started....");
        getMap().keySet().forEach(e-> System.out.println(e));
        System.out.println("Java streams foreach loop using values started....");
        getMap().values().forEach(employee -> System.out.println(employee.getId()+"=="+employee.getName()));

    }

    static Map<String,Employee> getMap(){
        Map<String,Employee> employeeMap = new HashMap<>();
        employeeMap.put("Vinod",new Employee(100,"vinod","vindo@gmail.com",10000.0,22));
        employeeMap.put("Raj",new Employee(101,"raj","raj@gmail.com",20000.0,25));
        return employeeMap;
    }
}
