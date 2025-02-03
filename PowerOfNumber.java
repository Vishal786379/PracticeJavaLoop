package com.vishal.practice.loop;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = helper.inputNumber();
		int y =  helper.inputNumber();
		
		int p = 1;
		
		for(int i =1;i<=y;i++) {
			p = p * x;
		}
		
		System.out.println("Result : " +p);
		
	}

}
