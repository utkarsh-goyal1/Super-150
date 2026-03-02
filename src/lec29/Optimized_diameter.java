package lec29;
import java.util.*;
public class Optimized_diameter {
	public class TreeNode 
	{
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) 
	      {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	}
	class Solution{
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dia;
		}
		public DiaPair diameter(TreeNode root)
		{
			if(root==null)
			{
				return new DiaPair();
			}
			DiaPair ldp=diameter(root.left);
			DiaPair rdp=diameter(root.right);
			int sd=ldp.ht+rdp.ht+2;
			DiaPair sdp=new DiaPair();
			sdp.dia=Math.max(sd, Math.max(rdp.dia, ldp.dia));
			sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
			return sdp;
		}
	}
		class DiaPair
		{
			int dia=0;
			int ht=-1;
		}
}	  


//note ->(i) one of the way to find the diameter of binary tree is brute force in which for every call we find the left tree height and right tree height and calculate the diameter which
//takes O(n^2) time complexity.
//(ii) Our time complexity is increased due to height function ,if we have the left tree height and right tree height for every node already then we will not require to call the height function
//again and again .So if we find the diameter in bottom up manner then we do not need to call the height function for every node ,we calculate the answer from bottom but in this condition
//we will require to use a static variable to store the max diameter.
//(iii) if we want to avoid the use of static variable then we can't return height and diameter both in the same function call and if we want to return the both things together then 
//we will have to use a class .With the help of class  by using the above logic we can simply find the diameter without using static variable.
