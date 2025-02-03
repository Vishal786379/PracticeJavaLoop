package com.vishal.practice.loop;

public class PerfectNumber {
	
	static boolean checkPerfectNumber(int n) {
		int sum =0;
		for(int i =1;i<n;i++) {
			if(n%i==0) {
				sum = sum +i;
			}
		}
	
	if(sum==n) {
//		System.out.println("Given number is perfect number");
		return true;
	}else {
//		System.out.println("Given number is not perfect number");
		return false;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = helper.inputNumber();
		boolean result = checkPerfectNumber(n);
		if(result) {
			System.out.println("Given number is perfect number");
		}else {
			System.out.println("Given number is not perfect number");
		}
	}

}
