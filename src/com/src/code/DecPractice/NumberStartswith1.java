package com.src.code.DecPractice;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumberStartswith1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,212,121,321,1234};
			 Object[] array = Arrays.stream(arr).boxed().
					filter(i->String.valueOf(i).startsWith("1")).toArray();
			 Arrays.stream(array).forEach(System.out::println);
	}

}
