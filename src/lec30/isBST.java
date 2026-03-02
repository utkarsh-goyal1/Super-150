package lec30;

public class isBST {
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
    public boolean isValidBST(TreeNode root) {
    	BstPair obj=ValidBST(root);
    	return obj.isBST;
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
    	if(lbp.isBST && rbp.isBST && lbp.max<root.val && rbp.min>root.val)
    	{
    		sbp.isBST=true;
    		sbp.max=Math.max(rbp.max, root.val);
    		sbp.min=Math.min(lbp.min, root.val);
    		return sbp;
    	}
    	sbp.isBST=false;
    	sbp.max=Math.max(rbp.max, Math.max(lbp.max, root.val));
		sbp.min=Math.min(rbp.min, Math.min(lbp.min, root.val));
    	return sbp;
    	
    }
   }
	class BstPair{
		boolean isBST=true;
		long min=Long.MAX_VALUE;
		long max=Long.MIN_VALUE;
	}
}
//maximum sum BST
//Largest BST Subtree