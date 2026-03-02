package DP;
import java.util.*;
public class DistinctSubsequences {
	public static void main(String []args)
	{
		String s1 = "rabbbit";
		String t1 = "rabbit";
		int [][]memo=new int[s1.length()+1][t1.length()+1];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i],-1);
		}
		System.out.println(countSubsequences(s1,t1,s1.length()-1,t1.length()-1,memo));
		//s1-->coin
		//t1-->amount
		//i-->s1 ka index
		//j-->t1 ka index
	}
	public static int countSubsequences(String s1,String t1,int i,int j,int [][]memo)
	{
		if(j<0)
		{
			return 1;
		}
		if(i<0)
		{
			return 0;
		}
		if(memo[i][j]!=-1)
		{
			return memo[i][j];
		}
		int inc=0;
		int exc=0;
		if(s1.charAt(i)==t1.charAt(j))
		{
			inc=countSubsequences(s1,t1,i-1,j-1,memo);
		}
		exc=countSubsequences(s1,t1,i-1,j,memo);
		return memo[i][j]=inc+exc;
	}
}
//substring method increase the time complexity of the code.so use index to change the length of string.