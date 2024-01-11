package com.src.Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Abc", 21, 10000);
		Employee e2 = new Employee("pqr", 26, 12000);
		Employee e3 = new Employee("mno", 28, 15000);
		Employee e4 = new Employee("jkl", 22, 19000);
		Employee e5 = new Employee("xyz", 23, 17000);
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		
		List<Employee> increasedSalary = employees.stream().map(e-> {
			if(e.getAge()>25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
//		System.out.println(increasedSalary);
		
		double sum = employees.stream().mapToDouble(e->e.getSalary()).sum();
		// System.out.println(sum);
		
		 List<String> collect = employees.stream().map(e->e.getName().toUpperCase()).
				 collect(Collectors.toList());
		 
		// System.out.println(collect);
		 
		 OptionalDouble max = employees.stream().mapToDouble(e->e.getSalary()).max();
		 System.out.println(max);
		 
		 // Sum of the salary of employees whose are more then 25 years.
		 
		 
		 double sum2 = employees.stream().filter(e->e.getAge()>25)
		 .mapToDouble(e->e.getSalary()).sum();
		 
		// System.out.println(sum2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
	
		
	}
}
