package com.vishal.practice.loop;

public class ReverseDigit {
	
	static void reverse(int n) {
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev =(rev*10)+r;
			n = n/10;
		}
		System.out.println("Reverse Number : "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =helper.inputNumber();
		reverse(n);
		
	}

}
