package com.array.assignment;

public class EvenSubarrays {
	
	public static String findPossibility(int[] arr) {
		
		if(arr.length%2==0 && arr[0]%2==0 && arr[arr.length-1]%2==0) {
			
			
				return "YES";
			
			
		}
		else
			return "NO";
		
	}

	public static void main(String[] args) {
		
		int[] arr = {978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940 };
		System.out.println("len:" + arr.length);
		System.out.println(findPossibility(arr));
	}

}
