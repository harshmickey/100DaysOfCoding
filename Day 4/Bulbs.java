package com.array.assignment;

public class Bulbs {

	public static int finfMinNumberofSwitches(int[] arr) {
		/*
		 * int count=0; for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]==0) { arr[i]=1; count++; for(int j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[j]==0) { arr[j]=1; } else { arr[j]=0; } } } }
		 */

		int count=0;
		for(int i=0;i<arr.length;i++) {

			if(count%2==0) {
				if(arr[i]==0) {
					arr[i]=1;
					count++;
				}
			}

			else {
				if(arr[i]==1) {
					count++;
				}

			}
		}
		return count;

	}

	public static void main(String[] args) {

		int[] arr = {0, 1, 0, 1};
		System.out.println(finfMinNumberofSwitches(arr));
	}

}
