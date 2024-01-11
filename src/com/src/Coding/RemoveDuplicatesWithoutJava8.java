package com.src.Coding;

import java.util.HashSet;

public class RemoveDuplicatesWithoutJava8 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,4,4};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for (Integer num : arr) {
			
			hs.add(num);
			
		}
		
		System.out.println(hs);
		
	}

}
