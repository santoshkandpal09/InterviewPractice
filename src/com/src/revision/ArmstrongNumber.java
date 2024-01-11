package com.src.revision;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		 
		int num=153;
		
		boolean armStrong = isArmStrong(num);
		
		System.out.println(armStrong);
		
	}
	
	public static boolean isArmStrong(int num) {
		
		int i=num;
		
		int sum=0;
		
		int digit=0;
		
		while(i>0) {
			digit=i%10;
			
			i=i/10;
			
			sum= sum+digit*digit*digit;
			
			
		}
		
		return sum==num;
		
		
		
	}
	
	

}
