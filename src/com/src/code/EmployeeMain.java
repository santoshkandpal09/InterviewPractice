package com.src.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee("Sumit",32,48000.0));
		ls.add(new Employee("Pratibha",24,88000.0));
		ls.add(new Employee("Santosh",27,60000.0));
		ls.add(new Employee("Saddam",24,18000.0));
		
		
		
		List<Employee> Incrementedsalary = ls.stream().map(e->{
			if(e.getAge()>25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(Incrementedsalary);
		
	}

}
