package lec29;
import java.util.*;
public class Flip_equivalent {
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
		    public boolean Flip_equivalent(TreeNode root1, TreeNode root2) {
		    	if(root1==null || root2==null)
		    	{
		    		return false;
		    	}
		        return check(root1,root2);
		    }
		    public static boolean check(TreeNode root1,TreeNode root2)
		    {
		    	if(root1==null && root2==null)
		    	{
		    		return true;	
		    	}
		    	if(root1==null || root2==null)
		    	{
		    		return false;
		    	}
		    	if(root1.val!=root2.val)
		    	{
		    		return false;
		    	}
		    	boolean flip=check(root1.left,root2.right) && check(root1.right,root2.left);
		    	boolean noflip=check(root1.left,root2.left) && check(root1.right,root2.right);
		    	return flip||noflip;
		    }
		    
		}
}
//for each node we have two choices - flip or not.
//it may be mirror images or they are same .
