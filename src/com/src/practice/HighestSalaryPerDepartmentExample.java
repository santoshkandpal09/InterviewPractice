package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryPerDepartmentExample {
	

	public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 50000),
                new Employee("Alice", "HR", 60000),
                new Employee("Bob", "IT", 75000),
                new Employee("Charlie", "IT", 80000)
                // Add more employees as needed
        );
        
   
      Map<String, Employee> Highestsalarybydepartment = employees.stream().
      collect(Collectors.groupingBy(e->e.getDepartment(),
       Collectors.
       collectingAndThen(Collectors.
       maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
      
      
      System.out.println(Highestsalarybydepartment);
        
        
        
        
}
	
	
	
}
