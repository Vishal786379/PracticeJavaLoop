package com.vishal.practice.loop;

import java.util.Scanner;

public class Factors {
	
	static void printFactors(int n) {
		
		
		System.out.println("Factors : ");
		for(int i = 1; i<=n;i++) {
			//check n is divide by i
			if(n%i==0) {
				System.out.println(i+"\t");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		printFactors(n);
	}

}
