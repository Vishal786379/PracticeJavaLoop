package com.vishal.practice.loop;

public class CountDigits {
	
	static int countDigits(int n) {
		int counter=0;
		
		while(n!=0) {
			int r = n%10;
			counter++;
			n = n/10;
		}
		System.out.println("Digit count is "+counter);
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = helper.inputNumber();
		countDigits(number);
	}

}
