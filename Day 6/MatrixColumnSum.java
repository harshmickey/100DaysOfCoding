package com.array.assignment;

public class MatrixColumnSum {
	
	public int[] findColSum(int[][] A) {
        int[] arr=new int[A[0].length];
        int sum=0;
        int count=0;
        for(int j=0;j<A[0].length;j++)
        {
            for(int i=0;i<A.length;i++) {

                sum=sum+A[i][j];
            
                
            }    arr[count]=sum;
                count++;
                sum=0;
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
