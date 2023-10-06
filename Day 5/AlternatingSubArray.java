package com.array.assignment;



public class AlternatingSubArray {


	public static boolean checkAlternating(int[] arr, int start, int end) {

		boolean str = true;

		for(int i=start;i<end;i++) {
			if(arr[i]==0 && arr[i+1]!=1) {
				return false;
			}
			else if(arr[i]==1 && arr[i+1]!=0) {
				return false;
			}
		}
		return str;
	}

	public static int[] findSubArray(int[] arr, int temp) {

		int k = (2*temp)+1;
		int[] arr1 = new int[arr.length-k+1];
		if(k==1) {

			for(int z=0;z<arr1.length;z++) {

				arr1[z]=z; 
			}

			return arr1;
		}

		else {
			int i=0,j=k+i-1;
			int x=0;

			while(i<arr.length-k+1) {
				if(checkAlternating(arr,i,j)==true) {

					arr1[x]=(j+i)/2;
					x++;
				}
				i++;
				j++;
			}
			int[] arr2 = new int[x];
			for(int c=0; c<arr2.length;c++) {
				arr2[c]=arr1[c];
			}
			

			return arr2;
		}

	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };
		int[] arr1 = findSubArray(arr,2);
		for(int i=0;i<arr1.length;i++) {

			System.out.print(arr1[i] + " ");
		}

	}

}
