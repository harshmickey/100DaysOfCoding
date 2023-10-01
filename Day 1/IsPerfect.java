package com.array.assignment;

import java.util.Scanner;

public class IsPerfect {

	public static void IsPerfect(long N) {
		
		int sum =0;
		for(int i=1;i<=N/2;i++)
		{
			if(N%i==0)
				sum+=i;
		}
		if (sum==N)
		{
			System.out.println("YES");
		}
		else{ 
			System.out.println("NO");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int j=0;j<x;j++)
		{
			long N = sc.nextLong();
			IsPerfect(N);	
		}
	}

}
