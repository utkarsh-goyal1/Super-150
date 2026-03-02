package Trie;
import java.util.*;
public class TrieCounts {
	class Node
	{
		char data;
		boolean isTerminal;
		HashMap<Character,Node>child = new HashMap<>();
		int count;
	}
	private Node root;
	public TrieCounts() 
	{
		Node nn = new Node();
		nn.data='*';
		root=nn;
		nn.count=0;
	}
	public void insert(String word)
	{
		Node curr =root;
		for(int i=0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			curr.count++;
			if(curr.child.containsKey(ch))
			{
				curr=curr.child.get(ch);
			}
			else
			{
				Node nn = new Node();
				nn.data=ch;
				curr.child.put(ch, nn);
				curr=nn;
			}
		}
		curr.isTerminal=true;
		curr.count++;
	}
	public boolean search(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch))
			{
				curr=curr.child.get(ch);
			}
			else
			{
				return false;
			}
		}
		if(curr.isTerminal==true)
		{
			return true;
		}
		return false;
	}
	public boolean startsWith(String prefix) 
	{
		Node curr=root;
		for(int i=0;i<prefix.length();i++)
		{
			char ch=prefix.charAt(i);
			if(curr.child.containsKey(ch))
			{
				curr=curr.child.get(ch);
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public int countPartials(String part)
	{
		Node curr=root;
		for(int i=0;i<part.length();i++)
		{
			char ch= part.charAt(i);
			if(curr.child.containsKey(ch))
			{
				curr=curr.child.get(ch);
			}
			else
			{
				return 0;
			}
		}
		return curr.count;
	}
}
//to count the partial strings, here we used a count variable in the node class.Whenever we visit a node in HashMap then we will increment the count which tells us that how many times 
//that particular node or character is visited and the count of visits tells us that how may words are present in the same string.So when we find the partial string then
//we will simply return the count of the last character of the partial String.
