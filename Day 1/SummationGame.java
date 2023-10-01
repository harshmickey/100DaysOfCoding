package com.array.assignment;

import java.util.Scanner;

public class SummationGame {

	public static void findSum(long N) {

		System.out.println(N*(N+1)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long N=sc.nextLong();
		findSum(N);
	}

}
