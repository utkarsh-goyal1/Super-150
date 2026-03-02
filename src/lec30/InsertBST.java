package lec30;
import java.util.*;
public class InsertBST {
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
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        TreeNode temp=new TreeNode(val);
	        TreeNode curr=root;
	        TreeNode parent=null;
	        while(curr!=null)
	        {
	            parent=curr;
	            if(curr.val<val)
	            {
	                curr=curr.right;
	            }
	            else if(curr.val>val)
	            {
	                curr=curr.left;
	            }
	            else
	            {
	                return root;
	            }
	        }
	        if(parent==null)
	        {
	            return temp;
	        }
	        if(parent.val>val)
	        {
	            parent.left=temp;
	        }
	        else
	        {
	            parent.right=temp;
	        }
	        return root;
	    }
	}
}
