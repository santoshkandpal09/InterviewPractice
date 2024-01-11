package com.src.code;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,4};
		int[] array = Arrays.stream(arr).distinct().toArray();
		Arrays.stream(array)
		//.forEach(System.out::println);
		.forEach(entry->System.out.println(entry));
		
		
	}

}
