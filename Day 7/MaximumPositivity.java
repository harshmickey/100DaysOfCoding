package com.array.assignment;

public class MaximumPositivity {
	
	public static int[] generateArray(int[] arr, int start, int len) {
		
		int end = len+start-1;
		int[] arr1 = new int[len];
		int x=0;
		for(int i=start;i<=end;i++) {
			arr1[x]=arr[i];
			System.out.println(arr[i]);
			x++;
		}
		return arr1;
	}

	public static int[] findSubArray(int[] arr) {

		int ans=0;
		int index=0;
		int left =0, leftIndex=0;
		int right =0, rightIndex=0;
		for(int j=0;j<arr.length;j++) {

			if(arr[j]<0) {

				left =0;
				leftIndex=0;
				for(int k=j-1;k>=0;k--) {
					if(arr[k]>=0) {
						left++;
						leftIndex=k;
					}
					else
						break;
				}
				right =0;
				for(int l=j+1;l<arr.length;l++) {
					if(arr[l]>=0) {
						right++;
						rightIndex=j+1;
					}
					else
						break;
					
				}
				
				if(left>=right) {
					if(left>ans) {
						ans = left;
						index=leftIndex;
					}
					else if(left==ans && index>leftIndex) {
						index=leftIndex;
					}
					
				}
				else {
					if(right>ans) {
						ans = right;
						index=rightIndex;
					}
					else if(right==ans && index>rightIndex) {
						index=rightIndex;
					}
				}
			}


		}
		return generateArray(arr,index,ans);
	}

	public static void main(String[] args) {

		int[] arr = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};
		findSubArray(arr);
	}

}
