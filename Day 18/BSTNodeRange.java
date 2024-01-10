package com.tree.assignment;

public class BSTNodeRange {

	int count=0;
	public int noOfBSTNodes(TreeNode A, int B, int C) {

		if(A==null) {

			return 0;
		}

		if(A.val>=B && A.val<=C) {

			count++;
			noOfBSTNodes(A.left,B,C);
			noOfBSTNodes(A.right,B,C);
		}
		if(A.val<B) {

			noOfBSTNodes(A.right,B,C);
		}
		if(A.val>C) {

			noOfBSTNodes(A.left,B,C);
		}

		return count;
	}

	public static void main(String[] args) {


	}

}
