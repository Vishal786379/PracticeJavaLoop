package com.vishal.practice.loop;

public class PrintPrime {

	
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(PrimeNumber.checkPrimeAdvance(i)) {
				System.out.println(i + "\t");
			}
		}
		System.out.println();
	}
}
