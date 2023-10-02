package com.array.assignment;

import java.util.Scanner;

public class RotationGame {

	public static int[] revArray(final int[] A, int start, int end) {

		int N=A.length;
		int i=start,j=end;
		int temp;
		while(i<=j)
		{
			temp=A[j];
			A[j]=A[i];
			A[i]=temp;
			i++;
			j--;

		} return A;

	}

	public static int[] rightShiftArray(int[] arr, int sh) {
		
		int len = arr.length;
		while(sh>len) {
			sh = sh-len;
		}
		arr = revArray(arr,0,len-1);
		arr = revArray(arr,0,sh-1);
		arr = revArray(arr,sh,len-1);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len;i++) {

			arr[i]= sc.nextInt();
		}
		int sh = sc.nextInt();
		//System.out.println(sh);
		arr = rightShiftArray(arr,sh);
		for(int i=0; i<len;i++) {

			System.out.print(arr[i] + " ");
		}

	}

}
