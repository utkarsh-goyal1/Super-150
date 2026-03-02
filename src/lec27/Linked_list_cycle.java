package lec27;
import lec27.Linked_list.Node;
public class Linked_list_cycle {
	public class Node
	{
		int val;
		Node next;
	}
	private Node head;//head is the first node of the linked list .it contains the actual address of the first node.
	private int size;
	private Node tail;
	public void AddFirst(int item)
	{
		Node nn=new Node();
		nn.val=item;
		if(size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{
			nn.next=head;//we have to put the address of head pointer in the newly node.
			head=nn;//Since we are adding element at the front of linked list that's why we have to shift the head pointer to the new node.
			this.size++;
		}
	}
	public void Display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	public void AddLast(int item)
	{
		if(size==0)
		{
			AddFirst(item);
		}
		else
		{
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;//put the address of the new node in the previous node and assign tail to the current node i.e, nn;
			tail=nn;
			size++;
		}
	}
	public Node GetNode(int k) throws Exception
	{
		if(k<0 || k>=size)
		{
			throw new Exception("Bklol k range me dedo");
		}
		Node temp=head;
		for(int i=1;i<=k;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public void CreateCycle()throws Exception
	{
		Node nn=GetNode(2);
		this.tail.next=nn;
	}
	public void CycleRemoval1()
	{
		Node meet =hasCycle(head);
		if(meet==null)
		{
			return ;
		}
		Node curr=head;
		while(curr!=null)
		{
			Node temp=meet;
			while(temp.next!=meet)
			{
				if(temp.next==curr)
				{
					temp.next=null;
					return ;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}
	}
	public void CycleRemoval2()
	{
		Node meet=hasCycle(head);
		if(meet==null)
		{
			return ;
		}
		//Cycle ka count.
		Node temp=meet;
		int count=1;
		while(temp.next!=meet)
		{
			count++;
			temp=temp.next;
		}
		//m length aage jayega
		Node fast=head;
		for(int i=1;i<count;i++)
		{
			fast=fast.next;
		}
		Node slow=head;
		while(slow.next!=fast.next)
		{
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}
	public void FloydCycleRemoval()
	{
		Node meet=hasCycle(head);
		if(meet==null)
		{
			return ;
		}
		Node fast=meet;
		Node slow=head;
		while(slow.next!=fast.next)
		{
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}
	public Node hasCycle(Node head) {
	       Node slow=head;
	       Node fast=head;
	       while(fast!=null && fast.next!=null)
	       {
	           slow=slow.next;
	           fast=fast.next.next;
	           if(slow==fast)
	           {
	               return slow;
	           }
	       }
	       return null;
	    }


}

