package DP;
import java.util.*;
public class LongestIncreasingSubsequence {
	public static void main(String []args)
	{
		int []arr= {10,9,2,5,3,7,101,18};
		System.out.println(optimisedLIS(arr));
	}
	public static int LIS(int []arr)
	{
		int []dp=new int[arr.length];
		dp[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			dp[i]=1;
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int res=dp[0];
		for(int i=1;i<dp.length;i++)
		{
			res=Math.max(res, dp[i]);
		}
		return res;
	}
	public static int optimisedLIS(int []A)
	{
		 int []comp=new int[A.length];
	       int k=0;
	       comp[k]=A[0];
	       for(int i=1;i<A.length;i++)
	       {
	           if(A[i]<comp[k])
	           {
	               int low=0;
	               int high=k;
	               while(low<=high)
	               {
	                   int mid=(low+high)/2;
	                   if(comp[mid]<A[i])
	                   {
	                       low=mid+1;
	                   }
	                   else
	                   {
	                       high=mid-1;
	                   }
	               }
	                comp[low]=A[i];
	           }
	           else if(A[i]!=comp[k])
	           {
	               k++;
	               comp[k]=A[i];   
	           }
	       }       
	       return k+1;
	    }
}
