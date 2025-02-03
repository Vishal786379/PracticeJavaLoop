package com.vishal.practice.loop;

public class DigitSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =helper.inputNumber();
		
		while(n>0) {
			int countDigit=CountDigits.countDigits(n);
			int digit=n/((int)Math.pow(10, countDigit-1));
			System.out.print((digit*digit)+"\t");
			n=n%((int)Math.pow(10, countDigit-1));
		}
		System.out.println();
	}

}
