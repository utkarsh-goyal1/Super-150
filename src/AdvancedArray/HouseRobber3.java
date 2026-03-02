package AdvancedArray;

public class HouseRobber3 {

}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//    public int rob(TreeNode root) {
//        HashMap<TreeNode,Integer>h=new HashMap<>();//to avoid overlapping subproblems.
//        return money(root,h);
//    }
//    public int money(TreeNode root,HashMap<TreeNode,Integer>h)
//    {
//        if(root==null)
//        {
//            return 0;
//        }
//        if(h.containsKey(root))
//        {
//            return h.get(root);
//        }
//        int rob=root.val;
//        int dontrob=0;
//        int rob1=0;
//        int rob2=0;
//        if(root.left!=null)//if i want to rob the current node then get money from left to left sutreee and left to right subtree.
//        {
//            rob1=money(root.left.left,h)+money(root.left.right,h);
//        }
//        if(root.right!=null)//if i want to rob the current node then get money from right to left sutreee and right to right subtree.
//        {
//            rob2=money(root.right.left,h)+money(root.right.right,h);
//        }
//        rob+=rob1+rob2;//calculate the total money
//        dontrob=money(root.left,h)+money(root.right,h);//money from dontrob
//        h.put(root, Math.max(rob,dontrob));
//        //take the max of both.
//        return Math.max(rob,dontrob);
//    }
//}
