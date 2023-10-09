package com.array.assignment;

public class MatrixMultiplication {
	
	public static int[][] findMultiplication(int[][] A, int[][] B) {
		
		 	int[][] C=new int[A.length][B[0].length];
	        
			for(int i=0;i<A.length;i++)
			{	
				for(int j=0;j<B[0].length;j++) {
					C[i][j]=0;
					for(int x=0;x<B[0].length;x++) {
						
						C[i][j]= B[i][x]*B[x][i];
					}
	                
				}
			}
			return C;
	}

	public static void main(String[] args) {
		

	}

}
