package com.tree.assignment;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode A) {

		if(A==null)
			return null;
		TreeNode rst = invertTree(A.left);
		TreeNode lst = invertTree(A.right);
		A.left=lst;
		A.right=rst;
		return A;
	} 

	public static void main(String[] args) {


	}

}
