package lec30;
import java.util.*;
public class CreateTreeUsingLevel {
	public class Node{
		int val;
		Node left;
		Node right;	
	}
	private Node root;
	Scanner sc=new Scanner (System.in);
	public CreateTreeUsingLevel()
	{
		createTree();
	}
	public void createTree()
	{
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		root=nn;
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node curr=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1)
			{
				Node ll=new Node();
				ll.val=c1;
				curr.left=ll;
				q.add(ll);
			}
			if(c2!=-1)
			{
				Node ll=new Node();
				ll.val=c2;
				curr.right=ll;
				q.add(ll);
			}
		}
		
	}
	public void preOrder()
	{
		preOrder(root);
	}
	public void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.val+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void main (String []args)
	{
		CreateTreeUsingLevel lv=new CreateTreeUsingLevel();
		lv.preOrder();
	}

}
