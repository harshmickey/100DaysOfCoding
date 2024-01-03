package com.array.assignment;

public class SubArraySum {

	public static int[] findSubArray(int[] arr, int x) {

		int i=0,j=0;
		int st=0,end=0;
		int sum=arr[0];
		int flag=0;
		while(j<arr.length) {

			if(sum==x) {
				st=i;
				end=j;
				flag=1;
				break;

			}
			else if(sum<x){
				j++;
				if(j<arr.length)
					sum = sum + arr[j];
			}
			else  {
				sum = sum - arr[i];
				i++;

			}
		}
		int[] arr1 = new int[end-st+1];
		int count=0;
		if(flag==0) {
			arr1[0]=-1;
			return arr1;
		}
		else {
			for(int k=st;k<=end;k++) {
				arr1[count]= arr[k];
				count++;
			}
			return arr1;

		}
	}

		public static void main(String[] args) {
			int[] arr = {1, 1000000000};
			System.out.println(findSubArray(arr,1000000000));

		}

	}
