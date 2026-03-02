package lec30;
import lec29.BinaryTree.Node;
public class BST {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	public BST(int []in)
	{
		root=createTree(in,0,in.length-1);
	}
	public Node createTree(int []in,int si,int ei)
	{
		if(si>ei)
		{
			return null;
		}
		int mid=(si+ei)/2;
		Node nn=new Node();
		nn.val=in[mid];
		nn.left=createTree(in,si,mid-1);
		nn.right=createTree(in,mid+1,ei);
		return nn;
	}
	public void preOrder()
	{
		preOrder(root);
	}
	private void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.val+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
