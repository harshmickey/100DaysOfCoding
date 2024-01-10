package com.tree.assignment;

public class SymmetricalBinaryTree {

	static int temp1=0;
	static int temp2=0;
	
	public static int isSymmetrical(TreeNode A, TreeNode B) {
		
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
			int temp1 = isSymmetrical(A.left,B.right);
			
			int temp2 = isSymmetrical(A.right,B.left);
			
			if(temp1==0 || temp2==0) {
				return 0;
			}
			else
				return 1;
		}
	}
	public static int isSymmetric(TreeNode A) {

		if(A==null) {
			return 1;
		}
		else
			return isSymmetrical(A.left,A.right);

		
	}

	public static void main(String[] args) {

		TreeNode tNode = new TreeNode(1);
		tNode.left=new TreeNode(2);
		tNode.right=new TreeNode(2);
		tNode.left.left=new TreeNode(3);
		tNode.left.right=new TreeNode(4);
		tNode.right.left=new TreeNode(4);
		tNode.right.right=new TreeNode(3);
		int temp = isSymmetric(tNode);
		System.out.println(temp);
	}

}
