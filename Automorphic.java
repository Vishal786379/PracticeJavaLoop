package com.vishal.practice.loop;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = helper.inputNumber();
		
		int square = n*n;
		
		int countDigit=CountDigits.countDigits(n);
		
		int lastDigit=square %(int)(Math.pow(10, countDigit));
		
		System.out.println("Square : "+square);
		
		System.out.println("Last Digits : "+lastDigit);
		
		if(n== lastDigit) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not Automorphic Number");
		}
		
	}

}
