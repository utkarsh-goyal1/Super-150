package lec30;
import java.util.*;
public class BTLevelOrderOptimised {
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
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>>res=new ArrayList<>();
	        List<Integer>li=new ArrayList<>();
	        if(root==null)
	        {
	            return res;
	        }
	        Queue<TreeNode>q=new LinkedList<TreeNode>();
	        Queue<TreeNode>hlp=new LinkedList<TreeNode>();
	        q.add(root);
	        while(!q.isEmpty())
	        {
	        	TreeNode curr=q.poll();
                li.add(curr.val);
                if(curr.left!=null)
                {
                    hlp.add(curr.left);
                }
                if(curr.right!=null)
                {
                    hlp.add(curr.right);
                }
                if(q.isEmpty())
                {
                	q=hlp;
                	hlp=new LinkedList<>();
                	System.out.println();
                }
	            res.add(new ArrayList<>(li));
	            li.clear();
	        }
	        return res;
	    }
	}
}
