//package AdvancedArray;
//
//public class AllNodesAtKDistance {
//
//}
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//        HashMap<Integer,HashSet<Integer>>h  = new HashMap<>();
//        formGraph(root,h);
//        List<Integer>li = new ArrayList<>();
//        calcDist(h,target,k,li);
//        return li;
//    }
//    public static void calcDist(HashMap<Integer,HashSet<Integer>>h,TreeNode source,int k,List<Integer>li)
//    {
//        HashMap<Integer,Integer>dist = new HashMap<>();
//        Queue<Integer>q = new LinkedList<>();
//        q.add(source.val);
//        dist.put(source.val,0);
//        HashSet<Integer>visited = new HashSet<>();
//        visited.add(source.val);
//        while(!q.isEmpty())
//        {
//            int curr=q.poll();
//            for(int ele:h.get(curr))
//            {
//                if(!visited.contains(ele))
//                {
//                    q.add(ele);
//                    visited.add(ele);
//                    dist.put(ele,dist.get(curr)+1);
//                }
//            }
//        }
//        for(Map.Entry<Integer,Integer>e:dist.entrySet())
//        {
//            if(e.getValue()==k)
//            {
//                li.add(e.getKey());
//            }
//        }
//    }
//    public static void formGraph(TreeNode root,HashMap<Integer,HashSet<Integer>>h)
//    {
//        Queue<TreeNode>q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty())
//        {
//            int size=q.size();
//            for(int i=0;i<size;i++)
//            {
//                TreeNode curr=q.poll();
//                if(!h.containsKey(curr.val))
//                {
//                    h.put(curr.val,new HashSet<>());
//                }
//                if(curr.left!=null)
//                {
//                    q.add(curr.left);
//                    h.get(curr.val).add(curr.left.val);
//                    if(!h.containsKey(curr.left.val))
//                    {
//                        h.put(curr.left.val,new HashSet<>());
//                    }
//                    h.get(curr.left.val).add(curr.val);
//                }
//                if(curr.right!=null)
//                {
//                    q.add(curr.right);
//                    h.get(curr.val).add(curr.right.val);
//                    if(!h.containsKey(curr.right.val))
//                    {
//                        h.put(curr.right.val,new HashSet<>());
//                    }
//                    h.get(curr.right.val).add(curr.val);
//                }
//            }
//        }
//    }
//}