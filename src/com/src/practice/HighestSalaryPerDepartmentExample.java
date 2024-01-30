package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        
        Map<String, Employee> highestSalaryByDepartment = employees.stream().
        		collect(Collectors.groupingBy(e->e.getDepartment(),
        		Collectors.collectingAndThen(Collectors.maxBy
        				(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
        
        System.out.println(highestSalaryByDepartment);
        
        
		/*
		 * Optional<Employee> maxSalary =
		 * employees.stream().max((e1,e2)->Integer.compare(e1.getSalary(),
		 * e2.getSalary()));
		 * 
		 * maxSalary.ifPresent(e1->System.out.println(e1.getSalary()));
		 */
        
        
      //    employees.stream().map(e->e.getName().toUpperCase()).forEach(System.out::println);
       
        
		/*
		 * double sum = employees.stream().mapToDouble(e->e.getSalary()).sum();
		 * System.out.println(sum);
		 */
        
		/*
		 * double average =
		 * employees.stream().mapToDouble(e->e.getSalary()).average().orElse(0.0);
		 * System.out.println(average);
		 */
        
		/*
		 * Map<String, Employee> highestsalarybyEachdepartment =
		 * employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.collectingAndThen(Collectors.
		 * maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		 * 
		 * System.out.println(highestsalarybyEachdepartment);
		 */
		/*
		 * Map<String, Employee> Highestsalarybydepartment = employees.stream().
		 * collect(Collectors.groupingBy(e->e.getDepartment(), Collectors.
		 * collectingAndThen(Collectors.
		 * maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		 */
      
   //   System.out.println(Highestsalarybydepartment);
      
	
      
      
      
	/*
	 * Optional<Employee> max =
	 * employees.stream().max((e1,e2)->Integer.compare(e1.getSalary(),
	 * e2.getSalary())); System.out.println(max);
	 */
      
      
  }
}