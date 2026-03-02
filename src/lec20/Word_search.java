package lec20;
import java.util.*;
public class Word_search 
{
	public static void main(String []args)
	{
		char [][]maze= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String s="ABCCED";
		for(int i=0;i<maze.length;i++)
		{
			for(int j=0;j<maze[0].length;j++)
			{
				if(maze[i][j]==s.charAt(0))
				{
					boolean res=search(maze,s,i,j,0);
					if(res)
					{
						System.out.println(res);
						return ;
					}
				}
			}
		}
		System.out.println(false);
	}
	public static boolean search(char [][]maze,String s,int cr,int cc,int idx)
	{
		if(idx==s.length())
		{
			return true;
		}
		if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length ||maze[cr][cc]!=s.charAt(idx))
		{
			return false;
		}
		int []r= {-1,1,0,0};
		int []c= {0,0,-1,1};
		maze[cr][cc]='*';
		boolean ans=false;
		for(int i=0;i<c.length;i++)
		{
			ans=search(maze,s,cr+r[i],cc+c[i],idx+1);
			if(ans)
			{
				return ans;
			}
		}
		maze[cr][cc]=s.charAt(idx);
		return false;
	}
}
