package com.src.Coding;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,4};
		
		Arrays.stream(arr).distinct()
		.forEach(e1->System.out.println(e1));
		
		
		
		
	}

}
