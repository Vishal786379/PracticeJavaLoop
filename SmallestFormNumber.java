package com.vishal.practice.loop;

public class SmallestFormNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = helper.inputNumber();

		//convert this num to array
		int countDigit=CountDigits.countDigits(n);
		
		
		int arr[]= new int[countDigit];
		
		int index =0;
		//put values to array
		while(n>0) {
			int r=n%10;
			arr[arr.length-1-index]=r;
			index++;
			n=n/10;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int i = 0;
		while(arr[i]==0) {
			
//			arr[i]=arr[i+1];
//			arr[i+1]=0;
			i++;
		}
		
		if(i>0) {
			arr[0]=arr[i];
			arr[i]=0;
		}
		
		//convert array to number
		int number = 0;
		for(int x:arr) {
			number=(number*10)+x;
		}
		
		System.out.println("Resulting Number : "+number);
		
//		System.out.println("Printing Array");
//		//printing array values
//		for(int x : arr) {
//		System.out.println(x);
	}
	

}
