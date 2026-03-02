package lec30;
import java.util.*;
public class ConvertSortedArrayToBST {
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
	  public TreeNode sortedArrayToBST(int[] nums) {
	        return convert(nums,0,nums.length-1);
	    }
	public TreeNode convert(int []nums,int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		int mid=(start+(end-start))/2;
		TreeNode curr=new TreeNode();
		curr.val=nums[mid];
		curr.left=convert(nums,start,mid-1);
		curr.right=convert(nums,mid+1,end);
		return curr;
	}
}
