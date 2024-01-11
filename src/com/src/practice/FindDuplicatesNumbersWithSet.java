package com.src.practice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesNumbersWithSet {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 5, 5, 6, 5};

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (int num : arr) {
            if (!uniqueSet.add(num)) {
                // If the number is already in the set, it's a duplicate
            	duplicateSet.add(num);
               
            }
        }
        
        System.out.println("Duplicate numbers: " + duplicateSet);
       
    }
}