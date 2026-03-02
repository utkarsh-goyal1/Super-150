package lec29;

import java.util.*;

public class Sum_root_to_leaf_numbers {
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
	    public int sumNumbers(TreeNode root) {
	        List<String>res=new ArrayList<>();
	        String ans="";
	        int sum=0;
	        for(int i=0;i<res.size();i++)
	        {
	        	sum+=Integer.parseInt(res.get(i));
	        }
	        return sum;
//	        return Numbers(root,0);
	    }
//	    public static void findPaths(TreeNode root,List<String>res,String ans)//1st solution
//	    {
//	    	if(root==null)
//	    	{
//	    		return ;
//	    	}
//	    	if(root.left==null && root.right==null)
//	    	{
//	    		res.add(ans+root.val);
//	    		return ;
//	    	}
//	    	findPaths(root.left,res,ans+root.val);
//	    	findPaths(root.right,res,ans+root.val);
//	    }
	    public static int Numbers(TreeNode root,int sum)//2nd solution
	    {
	    	if(root==null)
	    	{
	    		return 0;
	    	}
	    	if(root.left==null && root.right==null)
	    	{
	    		return sum*10+root.val;
	    	}
	    	int left=Numbers(root.left,sum*10+root.val);
	    	int right=Numbers(root.right,sum*10+root.val);
	    	return left+right;
	    }
	}
}
