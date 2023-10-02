package com.array.assignment;

import java.util.Scanner;

public class LittlePonny {
	
	public static int findCount(int[] arr, int x) {
		
		int count = 0;
		int ava = -1;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>x) {
				
				count++;
			}
			if(arr[i]==x) {
				ava = 0;
			}
		}
		
		if(ava!=-1) {
			return count;
		}
		else
			return ava;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2};
		int x = 3;
		System.out.println(findCount(arr,x));
	}

}
