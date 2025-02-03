package com.vishal.practice.loop;

public class CubeDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = helper.inputNumber();
		int sum = 0;
		
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				sum=sum+(r*r*r);
			}
			n=n/10;
		}
		System.out.println("Sum of cube of didgits : "+sum);
	}
}
