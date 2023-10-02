package com.array.assignment;

import java.util.Scanner;

public class SearchElement {

	public static int findElement(int[] arr, int x) {

		for(int i=0;i<arr.length;i++) {

			if(arr[i]==x) {

				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0;i<testcases;i++) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			for(int j=0;j<arr.length;j++) {
				arr[j]= sc.nextInt();

			}
			int x = sc.nextInt();
			System.out.println(findElement(arr,x));
		}

	}

}
