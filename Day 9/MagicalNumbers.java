package com.array.assignment;

public class MagicalNumbers {
	
	public static int findMagicNumber(int x) {
		
		String str = Integer.toBinaryString(x);
		int n =0;
		int sum =0;
		for(int i=str.length();i>=1;i--,n++) {
			sum = sum + (int)(Math.pow(5,i)*Character.getNumericValue(str.charAt(n)));
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.println(findMagicNumber(3));
	}

}
