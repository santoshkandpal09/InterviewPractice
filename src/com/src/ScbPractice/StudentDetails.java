package com.src.ScbPractice;

public interface StudentDetails {
	
	 void study();

	   
	    default void attendClasses() {
	        System.out.println("Attending classes");
	    }

	   
	    static String getSchoolName() {
	        return "delhi public School";
	    }

	    private void takeNotes() {
	        System.out.println("Taking notes");
	    }
	}

