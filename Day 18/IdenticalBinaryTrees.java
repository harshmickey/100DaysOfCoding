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

public class IdenticalBinaryTrees {
	
	public static int isSameTree(TreeNode A, TreeNode B) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(A);
        while(stk.size()>0) { 
            TreeNode pNode = stk.peek();
            if (pNode.left!=null) {
                stk.push(pNode.left);
                pNode.left = null; 
            } else {
                arr.add(pNode.val);
                stk.pop();
                if (pNode.right!=null)
                    stk.push(pNode.right);
            }
        }
		int count=0;
		stk.push(B);
        while(stk.size()>0) {             
			TreeNode pNode = stk.peek();
            if (pNode.left!=null) {
                stk.push(pNode.left);
                pNode.left = null; 
            } else {
                if(pNode.val != arr.get(count)){
					count++;
					return 0;
				}
					
                stk.pop();
                if (pNode.right!=null)
                    stk.push(pNode.right);
            }
        }
		return 1;
    }

	public static void main(String[] args) {
		
		TreeNode A = new TreeNode(0);
		TreeNode B = new TreeNode(0);
		
		System.out.println(isSameTree(A,B));
        
	}

}
