package lec29;

public class LongestConsecutiveSequenceBinaryTree {

}
//class Solution
//{
//	public int longestConsecutive(Node root)
//    {
//        int res=longestConsecutiveHelper(root, null, 0);
//        if(res==1)
//        {
//            return -1;
//        }
//        return res;
//    }
//    private int longestConsecutiveHelper(Node current, Node parent, int length) {
//        if (current == null) {
//            return length;
//        }
//
//        // Determine the length of the current sequence
//        length = (parent != null && current.data == parent.data + 1) ? length + 1 : 1;
//
//        // Get the length of the longest sequence in the left and right subtrees
//        int leftLength = longestConsecutiveHelper(current.left, current, length);
//        int rightLength = longestConsecutiveHelper(current.right, current, length);
//
//        // Return the maximum length found
//        return Math.max(length, Math.max(leftLength, rightLength));
//    }
//}
