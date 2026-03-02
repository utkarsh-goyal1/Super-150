package lec29;
import java .util.*;
public class BinaryTree {
	private Node root;
	Scanner sc=new Scanner(System.in);
	public BinaryTree()
	{
		root=createtree();
	}
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int val)
		{
			data=val;
		}
	}
	private Node createtree()
	{
		int item=sc.nextInt();
		Node nn=new Node(item);
		boolean hlc=sc.nextBoolean();
		if(hlc==true)
		{
			nn.left=createtree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc==true)
		{
			nn.right=createtree();
		}
		return nn;
	}
	public void Display()
	{
		Display(root);
	}
	public void max()
	{
		max(root);
	}
	public boolean find(int item)
	{
		return find(root,item);
	}
	private boolean find(Node root,int item)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==item)
		{
			return true;
		}
		boolean left=find(root.left,item);
		boolean right=find(root.right,item);
		if(left==true || right==true)
		{
			return true;
		}
		return false;
	}
	public void height()
	{
		height(root);
	}
	private int height(Node root)
	{
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left, right)+1;
	}
	private int max(Node root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int left=max(root.left);
		int right=max(root.right);
		return Math.max(root.data,Math.max(left, right));
	}
	public void postOrder()
	{
		postOrder(root);
	}
	private void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public void inOrder()
	{
		inOrder(root);
	}
	private void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void levelOrder()
	{
		levelOrder(root);
	}
	private void levelOrder(Node root)
	{
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int level=q.size();
			for(int i=0;i<level;i++)
			{
				Node curr=q.poll();
				System.out.print(curr.data+" ");
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
			}
			System.out.println();
		}
		
	}
	public void preOrder()
	{
		preOrder(root);
	}
	private void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	private void Display(Node nn)
	{
		if(nn==null)
		{
			return;
		}
		String s="";
		s="<--"+nn.data+"-->";
		if(nn.left!=null)
		{
			s=nn.left.data+s;
		}
		else
		{
			s="."+s;
		}
		if(nn.right!=null)
		{
			s=s+nn.right.data;
		}
		else
		{
			s=s+".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
}
