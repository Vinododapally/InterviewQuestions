package com.java.programs;

import com.java.programs.model.Employee;
import com.java.programs.model.Student;

import java.util.HashMap;
import java.util.Map;

public class FindTheInstanceObject {
    public static void main(String[] args) {
        Map<String,Object> map= new HashMap<>();
        map.put("Employee",new Employee(100,"vinod","vindo@gmail.com",10000.0,22));
        map.put("Student",new Student(100,"vinod","vindo@gmail.com"));
        for(Map.Entry<String,Object> maps: map.entrySet()){
            if(maps.getValue() instanceof Employee){
                getEmployeeDetails();
            } else if (maps.getValue() instanceof Student) {
                getStudentDetails();
            }
        }
    }

    static void getEmployeeDetails(){
        System.out.println("From employee object");
    }
    static void getStudentDetails(){
        System.out.println("From student object");
    }
}


