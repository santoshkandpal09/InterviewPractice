package com.src.ScbPractice;

import java.time.LocalDate;

import com.src.Coding.Employee;

public class StudentDateTime {
	
	
	    private int employeeId;
	    private String name;
	    private LocalDate hireDate;

	    public StudentDateTime(int employeeId, String name, LocalDate hireDate) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.hireDate = hireDate;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public LocalDate getHireDate() {
	        return hireDate;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "employeeId=" + employeeId +
	                ", name='" + name + '\'' +
	                ", hireDate=" + hireDate +
	                '}';
	    }

	    public static void main(String[] args) {
	        // Creating an Employee object with a LocalDate
	    	StudentDateTime employee = new StudentDateTime(1, "Santosh", LocalDate.of(2024, 1, 4));

	        // Accessing and printing employee details
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Hire Date: " + employee.getHireDate());

	        // Using toString method
	        System.out.println(employee);

	        // Getting the current date
	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Current Date: " + currentDate);
	    }
	}


}
