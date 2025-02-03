package com.vishal.practice.loop;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = helper.inputNumber();
		
		int i  = 2;
		do {
			if(n%i==0) {
				n=n/i;
				if(n<=1) {
					System.out.println(i);
				}else {
					System.out.println(i +"x");
				}
			}else {
				i++;
			}
		}while(n>0);
		System.out.println();
	}

}
