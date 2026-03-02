//package DP;
//import java.util.*;
//public class LongestCommonSubsequence {
//	public static void main(String []args)
//	{
//		String s1="abcde";
//		String s2="ace";
//		int [][]memo=new int[s1.length()+1][s2.length()+1];
//		for(int i=0;i<memo.length;i++)
//		{
//			Arrays.fill(memo[i],-1);
//		}
//		System.out.println(LCS(s1,s1.length(),s2,s2.length(),memo));
//	}
//	public static int LCS(String s1,int m,String s2,int n,int [][]memo)
//	{
//		if(m==0 || n==0)
//		{
//			return memo[m][n]= 0;
//		}
//		if(memo[m][n]!=-1)
//		{
//			return memo[m][n];
//		}
//		if(s1.charAt(m-1)==s2.charAt(n-1))
//		{
//			return memo[m][n]=LCS(s1,m-1,s2,n-1,memo)+1;
//		}
//		return memo[m][n]=Math.max(LCS(s1,m-1,s2,n,memo),LCS(s1,m,s2,n-1,memo));
//	}
//}
//


package DP;
import java.util.*;
public class LongestCommonSubsequence {
	public static void main(String []args)
	{
		String s1="abcde";
		String s2="ace";
		int [][]dp=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<dp.length;i++)
		{
			Arrays.fill(dp[i],-1);
		}
		for(int r=0;r<=s1.length();r++)
		{
			dp[r][0]=0;
		}
		for(int c=0;c<=s2.length();c++)
		{
			dp[0][c]=0;
		}
		System.out.println(LCS(s1,s2,dp));
	}
	public static int LCS(String s1,String s2,int [][]dp)
	{
		
		for(int r=1;r<=s1.length();r++)
		{
			for(int c=1;c<=s2.length();c++)
			{
				if(s1.charAt(r-1)==s2.charAt(c-1))
				{
					dp[r][c]=dp[r-1][c-1]+1;
				}
				else
				{
					dp[r][c]=Math.max(dp[r-1][c],dp[r][c-1]);
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}
}

