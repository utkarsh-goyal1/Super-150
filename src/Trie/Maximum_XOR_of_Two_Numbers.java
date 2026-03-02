package Trie;
import java.util.*;
public class Maximum_XOR_of_Two_Numbers {
	public static class Node{//Binary Trie
		Node zero;
		Node one;
	}
	public static void Insert(Node root,int val)
	{
		Node curr=root;
		for(int i=31;i>=0;i--)
		{
			int bit=(val&(1<<i));
			if(bit==0) 
			{
				if(curr.zero!=null)
				{
					curr=curr.zero;
				}
				else
				{
					Node nn = new Node();
					curr.zero=nn;
					curr=nn;
				}
			}
			else
			{
				if(curr.one!=null)
				{
					curr=curr.one;
				}
				else
				{
					Node nn = new Node();
					curr.one=nn;
					curr=nn;
				}
				
			}
		}
	}
	public static int getXor(Node root,int val)
	{
		int xor=0;
		Node curr=root;
		for(int i=31;i>=0;i--)
		{
			int bit=(val &(1<<i));
			if(bit==0)
			{
				if(curr.one!=null)
				{
					xor+=(1<<i);
					curr=curr.one;
				}
				else
				{
					curr=curr.zero;
				}
			}
			else
			{
				if(curr.zero!=null)
				{
					xor+=(1<<i);
					curr=curr.zero;
				}
				else
				{
					curr=curr.one;
				}
			}
		}
		return xor;
	}
	public static void main(String []args)
	{
		int []arr = {3,10,5,25,2,8};
		Node root= new Node();
		for(int val:arr)
		{
			Insert(root,val);
		}
		int ans=Integer.MIN_VALUE;
		for(int val:arr)
		{
			ans=Math.max(ans, getXor(root,val));
		}
		System.out.println(ans);
	}
}

//To approach this problem efficiently, you can observe that if you want to maximize the XOR result between two numbers, you'd want their binary representations to differ 
//as much as possible. This is where the Trie data structure comes into play.

//Method---
//1-Construct a Trie: We'll iterate through each number in the array and insert its binary representation into a Trie. 
//                    Each level of the Trie corresponds to a bit position in the binary representation of the numbers. At each level, we'll have two branches, 
//					  one for 0 and one for 1.

//2-Find Maximum XOR: After constructing the Trie, we'll iterate through each number again. For each number, we'll traverse the Trie to find the number that maximizes 
//                    the XOR result with the current number. We'll do this by starting from the most significant bit (MSB) and moving down the Trie, 
//                    trying to maximize the XOR value. We'll choose the opposite bit (1 if current bit is 0, and vice versa) whenever possible, as it maximizes the XOR value.

//3-Update Maximum XOR: As we traverse through the Trie for each number, we'll keep track of the maximum XOR value encountered so far.

//4-Return Maximum XOR: After iterating through all numbers, we'll return the maximum XOR value found.