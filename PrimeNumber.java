package com.vishal.practice.loop;

public class PrimeNumber {
	
	static boolean checkPrime(int n) {

		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean checkPrimeAdvance(int n) {
		boolean flag = true;
		
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = helper.inputNumber();
		if(checkPrimeAdvance(n)) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
		
	}

}
