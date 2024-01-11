package com.src.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintIntegerforArrayStartswith1 {
	
	public static void main(String[] args) {
		//int[] arr = { 1, 21, 13, 44, 15, 4 };
		
		List<Integer> asList = Arrays.asList(1, 21, 13, 44, 15, 4);
		
		//Arrays.stream(arr).boxed()
		asList.stream()
		.filter(e1->String.valueOf(e1).startsWith("1"))
		.forEach(System.out::println);
		//.forEach(e1->System.out.println(e1));
		}

}
