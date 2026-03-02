package lec34;
import java.util.*;
public class HashMap<K,V>{
	class Node
	{
		K key;
		V value;
		Node next;
	}
	ArrayList<Node>ll;
	private int size;
	public HashMap(int n)//Here we are using chaining method to implement HashMap.
	{
		ll=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			ll.add(null);
		}
	}
	public HashMap()//by default size of arraylist
	{
		this(4);
	}
	public int hashfun(K key)
	{
		int bn=key.hashCode()%ll.size();
		if(bn<0) {//if hash code is negative
			bn=bn+ll.size();
		}
		return bn;
	}
	public void put(K key,V value)
	{
		int idx=hashfun(key);
		Node temp=ll.get(idx);
		//if the key is already present then update the value;
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				temp.value=value;
				return ;
			}
			temp=temp.next;
		}
		//otherwise form a new node
		Node nn=new Node();
		nn.key=key;
		nn.value=value;
		//put the new Node in the list.we are adding at the front of the linked list so that tc remains O(1);
		temp=ll.get(idx);
		nn.next=temp;
		ll.set(idx, nn);
		size++;
		double thf=2.0;
		double lf=(1.0*size)/ll.size();
		if(lf>thf)//it means we have to rehashing.
		{
			rehashing();
		}
	}
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_list=new ArrayList<>();
		for(int i=0;i<2*ll.size();i++)
		{
			new_list.add(null);
		}
		ArrayList<Node>oba=ll;//old -> old bucket array
		ll=new_list;
		for(Node temp:oba)
		{
			while(temp!=null)
			{
				put(temp.key,temp.value);
				temp=temp.next;
			}
		}
	}
	public V get(K key)
	{
		int idx=hashfun(key);
		Node temp=ll.get(idx);
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	public boolean containsKey(K key)
	{
		int idx=hashfun(key);
		Node temp=ll.get(idx);
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public V remove(K key)
	{
		int idx=hashfun(key);
		Node curr=ll.get(idx);
		Node prev=null;
		while(curr!=null)
		{
			if(curr.key.equals(key))
			{
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null)
		{
			return null;
		}
		else if(prev==null)//we have to remove the head node.
		{
			ll.set(idx,curr.next);
			curr.next=null;
			size--;
			return curr.value;
		}
		else
		{
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.value;
		}
	}
	@Override
	public String toString()
	{
		String s="{";
		for(Node temp:ll)
		{
			while(temp!=null)
			{
				s=s+temp.key+"="+temp.value+",";
				temp=temp.next;
			}
		}
		return s.substring(0,s.length()-1)+"}";//to remove the comma
	}
}
