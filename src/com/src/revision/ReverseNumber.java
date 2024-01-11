package com.src.revision;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int numb=1543;
		
		int reverse=0;
		
			while(numb>0) {
				
				int reminder = numb%10;
				
				reverse = reverse*10+reminder;
				
				numb=numb/10;
				
				
			}
			
			System.out.println(reverse);
		
	}

}
