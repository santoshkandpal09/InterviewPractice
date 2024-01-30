package com.src.code.DecPractice;

public class MissingNumbers {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,8,9};
		int sum=0;
		
		int total= (9*10)/2;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		int missingNumber=total-sum;
		System.out.println(missingNumber);
	}

}
