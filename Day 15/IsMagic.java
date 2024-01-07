package com.array.assignment;

public class IsMagic {

	public static int findSum(int A) {

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

	public static int findMagicNumber(int x) {

		if(x==1) {
			return 1;
		}
		
		else if(x<10) {
			return 0;
		}
		return findMagicNumber(findSum(x));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findMagicNumber(findSum(1291)));

	}

}
