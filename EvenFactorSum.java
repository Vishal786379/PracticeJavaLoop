package com.vishal.practice.loop;

public class EvenFactorSum {
	
	static void printEvenFactorSum(int n) {
		int sum =0;
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						if(i%2==0) {
							sum=sum+i;
						}
					}
				}
		System.out.println("Even factor sum "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = helper.inputNumber();
		printEvenFactorSum(n);
	}

}
