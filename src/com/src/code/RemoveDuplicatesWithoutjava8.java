package com.src.code;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWithoutjava8 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,4,4};
		
		Set<Integer> hs = new HashSet<>();
		
		for (Integer duplicates : arr) {
			
			
			
			hs.add(duplicates);
			
			
		}
		
		System.out.println(hs);
		

	}	

}
