package com.src.code.DecPractice;

import java.util.HashSet;
import java.util.Set;

public class printoddeven {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
	   printOddThenEven(arr);
	
	}

	private static void printOddThenEven(int[] arr) {
		
		for (int num : arr) {
			if(num%2!=0) {
				System.out.println(num+" ");
			}
			
		}
		
		for (int num : arr) {
			if(num%2==0) {
				System.out.println(num+" ");
			}
		}
	}
	
	

}
