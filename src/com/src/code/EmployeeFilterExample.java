package com.src.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 60000.0));
        employees.add(new Employee("Alice", 55000.0));
        employees.add(new Employee("Bob", 45000.0));
        employees.add(new Employee("Eve", 75000.0));
        
        employees.stream().
        filter(e->(e.getName().toUpperCase()).collect(Collectors.toList());

        List<Employee> highEarningEmployees = employees.stream()
                .filter(e -> e.getSalary() > 50000.0)
                .collect(Collectors.toList());

        System.out.println("Employees earning more than 50000:");
        highEarningEmployees.forEach(e -> System.out.println(e.getName()+ e.getSalary()));
    }
}