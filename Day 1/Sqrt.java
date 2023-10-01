package com.array.assignment;

import java.util.Scanner;

public class Sqrt {

	public static int findSqrt(int A) {

		for(int i=1;i<=Math.sqrt(A);i++){
			if(i*i==A)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(findSqrt(sc.nextInt()));
	}

}
