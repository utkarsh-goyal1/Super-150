package Oops2;
import java.util.*;
public class LinkedList<T>{
	public class Node
	{
		T val;
		Node next;
	}
	private Node head;//head is the first node of the linked list .it contains the actual address of the first node.
	private int size;
	private Node tail;//tail is the last node of the linked list .it contains the actual address of the last node.
	public void AddFirst(T item)
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
	public void AddLast(T item)
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
	public Node GetNode(int k) throws Exception//k=2 means value at index 2.
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
	public void AddatIndex(T item,int k)throws Exception
	{
		if(k<0 || k>size)
		{
			throw new Exception("Index out of range");
		}
		if(k==0)
		{
			AddFirst(item);
		}
		else if(k==size)
		{
			AddLast(item);
		}
		else
		{
			Node nn=new Node();
			nn.val=item;
			Node k_1th =GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=nn;
			nn.next=kth;
			size++;
		}
	}
	public T getFirst()
	{
		return head.val;
	}
	public T getLast()
	{
		return tail.val;
	}
	public T getAtIndex(int k)throws Exception
	{
		return GetNode(k).val;
	}
	public T removeFirst()throws Exception
	{
		if(size==0)
		{
			throw new Exception("Linked list is empty");
		}
		T rv=head.val;
		if(size==1)
		{
			head=null;
			tail=null;
			size--;
		}
		else
		{
			Node temp=head;
			head=head.next;
			temp.next=null;//we have to break the linking of that first node.
			size--;
		}
		return rv;
	}
	public T removeLast()throws Exception
	{
		if(size==0)
		{
			throw new Exception("Linked list is empty");
		}
		T rv=tail.val;
		if(size==1)
		{
			head=null;
			tail=null;
			size--;
		}
		else
		{
			Node n=GetNode(size-2);
			tail=n;
			tail.next=null;
			size--;
		}
		return rv;
	}
	public T removeAnyIndex(int k)throws Exception
	{
		if(size==0)
		{
			throw new Exception("Linked list is empty");
		}
		if(k==0)
		{
			return removeFirst();
		}
		if(k==size-1)
		{
			return removeLast();
		}
		else
		{
			Node k_1th=GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.val;
		}
	}
	public static void main(String []args)
	{
		LinkedList<String>ll=new LinkedList<>();
		ll.AddLast("A");
		ll.AddLast("B");
		ll.AddLast("C");
		ll.AddLast("D");
		ll.Display();
		
	}
}
