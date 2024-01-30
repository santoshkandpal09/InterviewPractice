package com.src.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainClass {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("ABC", 30, "Female", "HR"));
		employees.add(new Employee("PQR", 25, "Male", "IT"));
		employees.add(new Employee("LMN", 30, "Male", "HR"));
		employees.add(new Employee("XYZ", 28, "Female", "IT"));

		// Map<String, Double> avgResult = employees.stream().collect
		// (Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(e->e.getAge())));
		// System.out.println(avgResult);

		// employees.stream().map(e->e.getDepartment())
		// .distinct().forEach(e->System.out.println(e));

//	Map<String, Long> employeeCount = employees.stream().
//	collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));

		// System.out.println(employeeCount);

//	Map<String, Double> avgResult1 = employees.stream().collect(Collectors.groupingBy
		// (Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		// System.out.println(avgResult1);

		employees.stream().filter(e -> e.getDepartment().equals("Male")).forEach(System.out::println);

	}

}
