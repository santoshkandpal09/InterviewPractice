package com.src.ScbPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortingExample {
	
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Santosh", 22));
	        students.add(new Student("Sumit", 20));
	        students.add(new Student("Saddam", 25));

	       
	        Collections.sort(students);
	        
	        
	        students.forEach(System.out::println);

	       
	        Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge);
	        students.sort(ageComparator);
	       
	        
	        students.forEach(System.out::println);
	    }
	}

