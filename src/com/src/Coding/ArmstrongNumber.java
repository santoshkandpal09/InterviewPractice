package com.src.Coding;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
	//	int number=153; //1634
		
		int number =1634;
		
		if(isArmStrong(number)) {
			System.out.println("Number is Armstrong");
		}
		
		else {
			System.out.println("The number is not armstrong");
		}
		
		
	}
	
	public static Boolean isArmStrong(int number) {
		
		int j = number;
		int sum=0;
		int digit=0;
		
		while(j>0) {
			
			digit=j%10;
			j=j/10;
			sum = sum+digit*digit*digit*digit;
		}
		
		return number==sum;
		
	}

}
