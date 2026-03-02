package lec29;
import java.util.*;
public class Path_sum {
	
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
		public boolean hasPathSum(TreeNode root, int targetSum) {
	        return find(root,targetSum);
	    }
		public static boolean find(TreeNode root,int targetSum)
		{
			
			if(root==null)
			{
				return false;
			}
			targetSum-=root.val;
			if(root.left==null && root.right==null && targetSum==0)
			{
				return true;
			}
			return find(root.left,targetSum)||find(root.right,targetSum);
		}
	}
}
