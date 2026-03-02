package Trie;
import java.util.*;
import Trie.Trie.Node;
public class WordSearch2 {
	static class Node{
		char data;
		String isWord=null;
		HashMap<Character,Node>child = new HashMap<>();
	}
	public static void insert(Node root,String word)
	{
		Node curr =root;
		for(int i=0;i<word.length();i++)
		{
			char ch = word.charAt(i);
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
		curr.isWord=word;
	}
	public static void main(String []args)
	{
		char [][]board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
		String []words = {"oath","pea","eat","rain"};
		Node root = new Node();
		for(String s:words)
		{
			insert(root,s);
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				if(root.child.containsKey(board[i][j]))
				{
					wordSearch(board,i,j,root);
				}
			}
		}
		System.out.println(ll);
		
	}
	static List<String >ll = new ArrayList<>();
	public static void wordSearch(char[][] board, int r, int c, Node root) {
		
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || !root.child.containsKey(board[r][c]))
        {
            return ;
        }
        char ch = board[r][c];
        Node curr= root.child.get(ch);
        if(curr.isWord!=null)
        {
        	ll.add(curr.isWord);
        	curr.isWord=null;
        }
        
		int []row ={-1,0,1,0};
		
	    int []column ={0,1,0,-1};
	    board[r][c]='*';
	    for(int i=0;i<column.length;i++)
	    {
	    	wordSearch(board,r+row[i],c+column[i],curr);
	    }
	    board[r][c]=ch;
	}
}
