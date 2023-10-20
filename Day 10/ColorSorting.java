package com.array.assignment;

public class ColorSorting {
	
	public static int[] sortByColor(int[] arr) {
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else if(arr[i]==1) {
				count1++;
			}
			else{
				count2++;
			}
		}
			int x=0;
			while(count0>0) {
				arr[x]=0;
				count0--;
				x++;
			}
			while(count1>0) {
				arr[x]=1;
				count1--;
				x++;
			}
			while(count2>0) {
				arr[x]=2;
				count2--;
				x++;
			}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {0};
		sortByColor(arr);
	}

}
