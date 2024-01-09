package com.tree.assignment;

public class CountNodes {
	
		int count=0;
	    public int totalNumberOfNodes(TreeNode tNode) {

	        if(tNode==null)
				return 0;
			else {
				count++;
				totalNumberOfNodes(tNode.left);
				totalNumberOfNodes(tNode.right);
			}
			return count;
	    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
