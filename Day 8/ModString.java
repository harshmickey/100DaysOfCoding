package com.array.assignment;

import java.math.BigInteger;

public class ModString {
	
	public static int findMod(String str, int x) {
		int sum=0;
		int n=1;
		for(int i=str.length()-1;i>=0;i--) {
			String str1 = Character.toString(str.charAt(i));
			sum = sum + (Integer.parseInt(str1)*n)%x;
			n= n*10;
			str1="";
		}
		return sum%x;
	}

	public static void main(String[] args) {
		
		String str = "8425549363022";
		System.out.println(findMod(str,	5));
	}

}
