package com.tree.assignment;

public class IdenticalBTRecursion {
	
	
	public static int isIdentical(TreeNode A, TreeNode B) {
		
		if(A==null && B==null) {
			return 1;
		}
		if((A!=null && B==null) || (A==null && B!=null)) {
			return 0;
		}
		if(A.val!=B.val) {
			return 0;
		}
		else {
			int temp1 = isIdentical(A.left,B.left);
			
			int temp2 = isIdentical(A.right,B.right);
			
			if(temp1==0 || temp2==0) {
				return 0;
			}
			else
				return 1;
		}
	}

	public static void main(String[] args) {
		
		TreeNode A = new TreeNode(5);
		TreeNode B = new TreeNode(5);
		System.out.println(isIdentical(A,B));
	}

}
