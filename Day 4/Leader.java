package com.array.assignment;

import java.util.ArrayList;

public class Leader {


	public static int[] findLeader(int[] A) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int max=A[A.length-1];
		arr.add(max);
		//System.out.println(max);
		for(int i=A.length-2;i>=0;i--)
		{
			if(A[i]>max)
			{

				max=A[i];
				//System.out.println(max);
				arr.add(max);
			}

		}
		int[] arr1 = new int[arr.size()];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]= arr.get(i);
			
		}
		return arr1;
	}
	public static void main(String[] args) {
		int[] A = {2,3,5,7,1};
		System.out.println(findLeader(A));



	}



}
