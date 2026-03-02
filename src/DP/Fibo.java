package DP;
import java.util.*;
public class Fibo {
	public static void main(String []args)
	{
		int n=5;
//		int []memo=new int[n+1];
//		Arrays.fill(memo, -1);
		int []dp=new int[n+1];
		Arrays.fill(dp, -1);
		//System.out.println(fibonacci(n,memo));
		dp[0]=0;
		dp[1]=1;
		System.out.println(fibonacci(n,dp));
	}
//	public static int fibonacci(int n,int []memo) //memoization
//	{
//		if(n==0 || n==1)
//		{
//			return n;
//		}
//		if(memo[n]!=-1)
//		{
//			return memo[n];
//		}
//		int n1=fibonacci(n-1,memo);
//		int n2=fibonacci(n-2,memo);
//		return memo[n]=n1+n2;
//	}
	public static int fibonacci(int n,int []dp)   //tabulation
	{
		for(int i=2;i<dp.length;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
