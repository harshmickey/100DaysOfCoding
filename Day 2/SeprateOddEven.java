package com.array.assignment;

import java.util.Scanner;

public class SeprateOddEven {


	public static void print(int[] arr) {

		for(int i=0;i<arr.length;i++) {

			if(arr[i]%2!=0) {

				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++) {

			if(arr[i]%2==0) {

				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i=0;i<testCases;i++) {

			int len = sc.nextInt();
			int[] arr = new int[len];
			for(int j=0;j<len;j++) {
				arr[j]=sc.nextInt();
			}
			print(arr);
		}

	}

}
