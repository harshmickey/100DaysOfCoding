package com.tree.assignment;

public class TreeHeight {
	
	
	public static int findHeight(TreeNode tNode) {
		
		int height=0;
		if(tNode==null){
            return 0;
        }
		if(tNode.left==null && tNode.right==null) {
			return 1;
		}
		else {
			height = Math.max(findHeight(tNode.left), findHeight(tNode.right))+1;
		}
		return height;
	}

	public static void main(String[] args) {
		

	}

}
