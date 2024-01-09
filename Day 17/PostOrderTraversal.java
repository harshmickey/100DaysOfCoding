package com.tree.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Stack<TreeNode> stk = new Stack<TreeNode>();

	public int[] preOrderTraversal(TreeNode root) {

		stk.push(root);
		while(stk.size()>0) {
			TreeNode tNode = stk.peek();
			if(tNode.left==null && tNode.right==null) {
				arr.add(stk.pop().val);
			}
			if(tNode.left!=null) {
				stk.push(tNode.left);
				tNode.left=null;
			}
			else {
				
				if(tNode.right!=null) {
					stk.push(tNode.right);
					tNode.right=null;
				}
			}
		}
		int[] arr1 = arr.stream().mapToInt(i -> i).toArray();
		
		return arr1;
	}
	public static void main(String[] args) {
		

	}

}
