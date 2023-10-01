package com.array.assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(A+" * "+i+" = "+A*i);
		}
	}

}
