package com.src.code;

import java.util.Arrays;

public class PrintIntegerforArrayStartswith1 {

	public static void main(String[] args) {
		int[] arr = { 1, 21, 13, 44, 15, 4 };

		int[] array = Arrays.stream(arr).
				filter(entry -> String.valueOf(entry).startsWith("1")).toArray();

		Arrays.stream(array).forEach(System.out::println);
	}

}
