package com.array.assignment;

public class ReverseArray {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,8};
		arr = revArray(arr);
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}

	}

}
