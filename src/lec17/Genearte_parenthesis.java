package lec17;
import java.util.*;
public class Genearte_parenthesis {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		parenthesis(n,"",0,0);
	}
	public static void parenthesis(int n,String ans,int open,int close)
	{
		if(open==n && close==n)
		{
			System.out.print(ans+" ");
			return ;
		}
		if(open<n)
		{
			parenthesis(n,ans+"(",open+1,close);
		}
		if(close<open)
		{
			parenthesis(n,ans+")",open,close+1);
		}
	}
}
