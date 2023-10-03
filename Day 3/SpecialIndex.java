package com.array;

public class SpecialIndex {


	/*
	 * Special Index is defined as that index which is when deleted the sum of even
	 * indices elements it equal to sum of Odd indices elements
	 */

	public static int[] prefixEvenSum(int[] arr) {

		int eAS[] = new int[arr.length];
		eAS[0]=arr[0];
		for(int i=1;i<eAS.length;i++) {

			if(i%2==1) {

				eAS[i] = eAS[i-1];
			}
			else {
				eAS[i] = arr[i]+eAS[i-1];
			}

		}

		return eAS;
	}


	public static int[] prefixOddSum(int[] arr) {

		int oAS[] = new int[arr.length];
		oAS[0]=0;
		for(int i=1;i<oAS.length;i++) {

			if(i%2==1) {

				oAS[i] = oAS[i-1] + arr[i];
			}
			else {
				oAS[i] = oAS[i-1];
			}

		}

		return oAS;
	}
	public static int noOfSpclIndx(int[] arr) {

		int[] prefixEvenArray = prefixEvenSum(arr);
		int[] prefixOddArray = prefixOddSum(arr);
		int totalEvenSum=0;
		int totalOddSum=0;
		int start=0, end=0;
		int count =0;
		for(int i=0;i<arr.length;i++) {

			start=0;
			end = i-1;
			totalEvenSum=0;
			totalOddSum=0;

			if(start==0 && end<0) {

				totalEvenSum = totalEvenSum + prefixOddArray[prefixOddArray.length-1];
				totalOddSum = totalOddSum + prefixEvenArray[prefixEvenArray.length-1] - prefixEvenArray[0];

			}

			else { 
				
				if(start==0 && end>=0) {

					totalEvenSum = totalEvenSum + prefixEvenArray[end];
					totalOddSum = totalOddSum + prefixOddArray[end];

				}
				else {

					totalEvenSum = totalEvenSum + prefixEvenArray[end]-prefixEvenArray[start-1];
					totalOddSum = totalOddSum + prefixOddArray[end]-prefixOddArray[start-1];
				}
				start=i+1;
				end=arr.length-1;
				totalEvenSum = totalEvenSum  + prefixOddArray[end]-prefixOddArray[start-1];
				totalOddSum = totalOddSum + prefixEvenArray[end]-prefixEvenArray[start-1];
			}
			if(totalEvenSum==totalOddSum) {
				
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = {4,3,2,7,6,-2};
		System.out.println(noOfSpclIndx(arr));

	}

}
