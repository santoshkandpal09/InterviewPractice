package com.src.RoughPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
	employees.add(new Employee("Santosh", 28, "IT", 75000));
	employees.add(new Employee("Yashi", 30, "HR", 55000));
	employees.add(new Employee("Sumit", 32, "IT", 45000));
	employees.add(new Employee("anuj", 26, "HR", 65000));
	
	
	/*
	 * List<Employee> increasedSalary = employees.stream().map(e->{
	 * if(e.getSalary()>50000) { e.setSalary(e.getSalary()*2); } return e;
	 * }).collect(Collectors.toList());
	 * 
	 * System.out.println(increasedSalary);
	 */
	
	/*
	 * int sum = employees.stream().mapToInt(e->e.getSalary()).sum();
	 * System.out.println(sum);
	 */
	
	
	
	/*
	 * List<Employee> collect =
	 * employees.stream().filter(e->e.getDepartment().contains("HR"))
	 * .collect(Collectors.toList());
	 * 
	 * System.out.println(collect);
	 */
	
	/*
	 * Map<String, Employee> highestSalaryByDepartment =
	 * employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
	 * Collectors.collectingAndThen(Collectors.maxBy
	 * (Comparator.comparingInt(e->e.getSalary())), Optional::get)));
	 * 
	 * System.out.println(highestSalaryByDepartment);
	 */
	
	/*
	 * List<String> eachDepartment =
	 * employees.stream().map(e->e.getDepartment()).distinct().toList();
	 * 
	 * System.out.println(eachDepartment);
	 */
	/*
	 * Employee maxSalary = employees.stream().
	 * max((e1,e2)->Integer.compare(e1.getSalary(),
	 * e2.getSalary())).orElseThrow(null);
	 * System.out.println(maxSalary.getSalary());
	 */
	/*
	 * Object[] uppercase =
	 * employees.stream().map(e->e.getName().toUpperCase()).toArray();
	 * System.out.println(Arrays.toString(uppercase));
	 */
	
	
	/*
	 * double avgSalary =
	 * employees.stream().mapToInt(e->e.getSalary()).average().orElse(0.0);
	 * 
	 * 
	 * System.out.println(avgSalary);
	 */
	
	}

}
