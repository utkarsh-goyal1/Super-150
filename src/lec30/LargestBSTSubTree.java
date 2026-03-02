package lec30;
//Given a binary tree, find the largest subtree which is a Binary Search Tree (BST), where largest means subtree with largest number of nodes in it.
public class LargestBSTSubTree {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	 	 }
	class Solution {
	    public long BstSubTree(TreeNode root) {
	    	BstPair obj=ValidBST(root);
	    	return obj.size;
		 }
	    public BstPair ValidBST(TreeNode root)
	    {
	    	if(root==null)
	    	{
	    		return new BstPair();
	    	}
	    	BstPair lbp=ValidBST(root.left);
	    	BstPair rbp=ValidBST(root.right);
	    	BstPair sbp=new BstPair();
	    	sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
	    	sbp.min=Math.min(root.val,Math.min(rbp.min,lbp.min));
	    	if(lbp.isBST && rbp.isBST && lbp.max<root.val && rbp.min>root.val)
	    	{
	    		sbp.isBST=true;  
	    		sbp.size=lbp.size+rbp.size+1;
	    	}
	    	else
	    	{
	    		sbp.isBST=false;
	    		sbp.size=Math.max(lbp.size, rbp.size);
	    	}
	    	return sbp;
	    	
	    }
	   }
		class BstPair{
			boolean isBST=true;
			long size=0;
			long min=Long.MAX_VALUE;// minimum value in that tree
			long max=Long.MIN_VALUE;// maximum value in that tree
		}
	}