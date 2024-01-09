package com.tree.assignment;

import java.util.ArrayList;
import java.util.Stack;

/*class TreeNode{
int val;
TreeNode left;
TreeNode right;

TreeNode(int val){
	this.val=val;
	this.left=null;
	this.right=null;

}
}*/


public class PreOrderTraversal {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Stack<TreeNode> stk = new Stack<TreeNode>();

	public int[] preOrderTraversal(TreeNode root) {

		stk.push(root);
		while(stk.size()>0) {
			TreeNode tNode = stk.pop();
			arr.add(tNode.val);
			if(tNode.right!=null) {
				stk.push(tNode.right);
				tNode.right=null;
			}
			
			if(tNode.left!=null) {
				stk.push(tNode.left);
				tNode.left=null;
			}
			
		}
		int[] arr1 = arr.stream().mapToInt(i -> i).toArray();

		return arr1;


	}

	public static void main(String[] args) {


	}
}
