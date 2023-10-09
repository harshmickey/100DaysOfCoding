package com.array.assignment;

public class RotateMatrix {

	public static int[][] findTranspose(int[][] arr) {

		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<i;j++) {

				int temp =arr[i][j]; 
				arr[i][j]=arr[j][i]; 
				arr[j][i]=temp; 
			} 
		} 
		return arr;
	}

	public static int[] revArray(final int[] A) {

		int N=A.length;
		int i=0,j=N-1;
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


	public static int[][] findRotatedMatrix(int[][] arr) {

		arr = findTranspose(arr);
        for(int i=0;i<arr.length;i++) {

            arr[i] = revArray(arr[i]);
        }
        return arr;
	}

	public static void main(String[] args) {

		
	}

}
