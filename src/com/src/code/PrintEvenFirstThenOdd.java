package com.src.code;

import java.util.Iterator;

public class PrintEvenFirstThenOdd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		sortArray(arr);

	}

	public static void sortArray(int arr[]) {

		int arr1[] = new int[arr.length];

		int index = 0;

		

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 != 0) {

				arr1[index] = arr[i];
				index++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				arr1[index] = arr[i];
				index++;
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
