package com.array.assignment;

public class DigitSum {

	
	public static int findSum(int A){
		int sum=0;
		if(A<10){
			sum=sum+A;
			return sum;
		}
		else{
			sum=sum+(A%10);
			A=A/10;
			return findSum(A)+sum;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSum(123));
	}

}
