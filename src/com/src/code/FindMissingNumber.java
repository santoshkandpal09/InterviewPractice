package com.src.code;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,3,4,5,6,7,9,10};
		
		int sum =(10*11)/2;  // formula = (n*n+1)/2;
		
		int actual_sum=0;
		
		for(int i=0;i<arr.length;i++) {
			actual_sum=actual_sum+arr[i];
		}
		
		System.out.println("Missing number is: "+(sum-actual_sum));
	}

}
