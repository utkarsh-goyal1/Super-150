package lec29;

public class ConvertLeafToDoublyLinkedList {

}
//class Tree{
//    // return the head of the DLL and remove those node from the tree as well.
//    public Node convertToDLL(Node root)
//    {
//        head=null;
//        tail=null;
//        removeLeaf(root);
//        return head;
//    }
//    Node head=null;
//    Node tail= null;
//    public Node removeLeaf(Node root)
//    {
//        if(root==null)
//        {
//            return null;
//        }
//        if(root.left==null && root.right==null)
//        {
//            if(head==null)
//            {
//                head=root;
//                tail=root;
//            }
//            else
//            {
//                tail.right=root;
//                root.left=tail;
//                tail=root;
//            }
//            return null;
//        }
//        root.left= removeLeaf(root.left);
//        root.right= removeLeaf(root.right);
//        return root;
//    }
//}

