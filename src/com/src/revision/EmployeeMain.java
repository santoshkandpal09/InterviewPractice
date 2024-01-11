package com.src.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(12, "Santosh", "IT", 20000));
		employees.add(new Employee(13, "Madhu", "HR", 25000));
		employees.add(new Employee(14, "Satish", "IT", 65000));
		employees.add(new Employee(15, "Pinki", "HR",55000 ));
		
		
	int totalSalary=employees.stream().mapToInt(e->e.getSalary()).sum();
	// System.out.println(totalSalary);
	
		
	Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
			Collectors.averagingDouble(e->e.getSalary())));
	
	System.out.println(avgSalary);
	
	
		List<Employee> collect = employees.stream().filter(e->e.getDepartment().equals("HR"))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
		
		
		
		int sum = employees.stream().mapToInt(e->e.getSalary()).sum();
		 // System.out.println(sum);
		
		 List<String> uppercase = employees.stream()
				.map(e->e.getName().toUpperCase())
				.collect(Collectors.toList());
		
		// System.out.println(uppercase);
		 
		 
		//  employees.stream().map(e->e.getDepartment())
	//	 .distinct()
		// .forEach(System.out::println);
		 
		 Map<String, Double> avgSalary1 = employees.stream().
				 collect(Collectors.groupingBy(e->e.getDepartment(),
				 Collectors.averagingInt(e->e.getSalary())));
		 
		// System.out.println(avgSalary);
		 
		  double average = employees.stream().filter(e->e.getDepartment().equals("HR"))
		 .mapToInt(Employee::getSalary)
		 .average()
		 .orElse(0.0);
		 
	//	 System.out.println(average);
		  
		  
		 // Integer max = employees.stream().mapToInt(i->i.getSalary()).max().orElse(0);
		//  System.out.println(max);
		 
		 
		 
		 
		
		
	}

}