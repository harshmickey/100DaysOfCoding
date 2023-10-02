package com.array.assignment;


public class MultipleLeftRotation {


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

	public static int[] leftShiftArray(int[] arr, int sh) {
		
		int len = arr.length;
		while(sh>len) {
			sh = sh-len;
		}
		arr = revArray(arr,0,len-1);
		arr = revArray(arr,0,len-sh-1);
		arr = revArray(arr,len-sh,len-1);
		return arr;
	}

	public static int[][] printMatrix(int[] A, int[] B){

		int[][] matrix = new int[B.length][A.length];
		int[] temp = new int[A.length];
		for(int i=0;i<temp.length;i++) {

			temp[i]=A[i];
		}
		for(int j=0;j<B.length;j++) {

			leftShiftArray(A, B[j]);
			for(int i=0;i<A.length;i++) {

				matrix[j][i] = A[i];
			}
			for(int k=0;k<A.length;k++) {

			    A[k]=temp[k];
		    }
			
		}

		return matrix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 5};
		int[] B = {2,3};
		int[][] result = printMatrix(A,B);
		for(int j=0;j<B.length;j++) {


			for(int i=0;i<A.length;i++) {

				System.out.print(result[j][i] + " ");
			}
			System.out.println("");
		}
	}

}
