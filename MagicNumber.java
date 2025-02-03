package com.vishal.practice.loop;

public class MagicNumber {
	
	static int digitSum(int n) {
		int s=0;
		while(n>0) {
			s=s+(n%10);
			n=n/10;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= helper.inputNumber();
		
		int sum = 0;
		while(n >0) {
			sum =digitSum(n);
			if(sum<10) {
				break;
			}else {
				n=sum;
			}
		}
		if(sum==1) {
			System.out.println("Yes, It is a Magic Number");
		}else {
			System.out.println("No, It is Not a "
					+ ""
					+ ""
					+ "Magic Number");
		}
	}

}
