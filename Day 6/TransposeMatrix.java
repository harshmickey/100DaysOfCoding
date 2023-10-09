package com.array.assignment;

public class TransposeMatrix {

	public static int[][] findTranspose(int[][] arr) {


		/* For Rectangle Matrix you need to use below code with extra space */

		/*
		 * int[][] matrix = new int[arr[0].length][arr.length]; for(int
		 * i=0;i<arr.length;i++) {
		 * 
		 * for(int j=0;j<arr[0].length;j++) {
		 * 
		 * matrix[j][i]= arr[i][j]; } } return matrix;
		 */


				/* For SQAURE matrix */
				
				  for(int i=0;i<arr.length;i++) {
				  
					  for(int j=0;j<i;j++) {
				  
						  int temp =arr[i][j]; 
						  arr[i][j]=arr[j][i]; 
						  arr[j][i]=temp; 
					} 
				} return arr;
				 

	}

	public static void main(String[] args) {

		int[][] arr = {{1, 2},{3, 4}};
		int[][] finalMatrix =  findTranspose(arr);
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[0].length;j++) {

				System.out.print(finalMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
