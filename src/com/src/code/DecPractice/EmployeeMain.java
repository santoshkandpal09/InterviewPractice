package com.src.code.DecPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(1, "Santosh", "IT", 33000, 28));
		ls.add(new Employee(2, "Saddam", "HR", 83000, 30));
		ls.add(new Employee(3, "Sumit", "IT", 75000, 26));
		ls.add(new Employee(4, "Yashi", "HR", 45000, 32));
		
		
		List<Employee> collect = ls.stream().map(e->{
			if(e.getSalary()>50000) {
				e.setSalary(e.getSalary()*2);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(collect);
		
		/*
		 * Map<String, Employee> collect =
		 * ls.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(e->e.
		 * getSalary())), Optional::get))); System.out.println(collect);
		 */
		
		/*
		 * Map<String, Employee> collect =
		 * ls.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.
		 * getSalary())), Optional::get))); System.out.println(collect);
		 */
		
	//	ls.stream().filter(e->e.getSalary()>50000)
	//	.forEach(e->System.out.println(e));
		
		
	//	List<String> list = ls.stream().map(e->e.getName().toUpperCase()).toList();
	//	System.out.println(list);
		
		/*
		 * double orElse =
		 * ls.stream().mapToLong(e->e.getSalary()).average().orElse(0.0);
		 * System.out.println(orElse);
		 */
		
		 
	//	Integer max = ls.stream().mapToInt(e->e.getSalary()).max().orElse(0);
	//	System.out.println(max);
		
		//Optional<Employee> max = ls.stream().max((e1,e2)->Integer.compare(e1.getSalary(), e2.getSalary()));
	//	System.out.println(max);
		
	//	ls.stream().map(e->e.getDepartment()).distinct().forEach(e->System.out.println(e));
		
		
	}
	
	

}
