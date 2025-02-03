package com.vishal.practice.loop;

public class SmallDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = helper.inputNumber();
		int small = n%10;
		
		while(n>0) {
			int r= n%10;
			if(r<small) {
				small=r;
			}
			n=n/10;
		}
		System.out.println("Smallest Value is : "+small);
	}

}
