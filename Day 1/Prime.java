package com.array.assignment;

import java.util.Scanner;

public class Prime {

	public static String IsPrime(long x) {
		
		if(x==0 || x==1) {
			return "NO";
		}
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				return "NO";
			}
		}
		return "YES";
	}


	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		long A=sc.nextLong();
		System.out.println(IsPrime(A));
	}

}
