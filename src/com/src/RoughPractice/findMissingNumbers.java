package com.src.RoughPractice;

public class findMissingNumbers {
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,3,4,5,6,7,9,10};
		
		int total_integer=10;
		
		int sum=(10*11)/2;
		int total=0;
		
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		
		int missed_number=sum-total;
		System.out.println(missed_number);
	}

}
