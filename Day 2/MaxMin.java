package com.array.assignment;

import java.util.Scanner;

public class MaxMin {
	
	public static void findMaxMin(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
				
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max + " " + min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		findMaxMin(arr);

	}

}
