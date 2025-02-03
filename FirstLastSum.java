package com.vishal.practice.loop;

public class FirstLastSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = helper.inputNumber();
		int lastDigit=n%10;
		int digits=CountDigits.countDigits(n);
		int fisrtDigit=n/((int)Math.pow(10, digits-1));
		System.out.println("First and Last Digit Sum is : "+(fisrtDigit+lastDigit));
	}

}
