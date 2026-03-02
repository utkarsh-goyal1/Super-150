package lec11;
import java.util.*;
public class Subarray_sum_divisible_by_n {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int []A=new int[n];
			for(int j=0;j<n;j++)
			{
				A[j]=sc.nextInt();
			}
			System.out.println(GoodSubArray(A));
		}
	}
	public static long GoodSubArray(int []A)
	{
		int n=A.length;
		long[]freq=new long[n];
		int sum=0;
		freq[0]=1;
		for(int i=0;i<freq.length;i++)
		{
			sum+=A[i];
			sum=sum%n;
			if(sum<0)
			{
				sum+=n;
			}
			freq[sum]=freq[sum]+1;
		}
		long ans=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>=2)
			{
				ans=ans+(freq[i]*(freq[i]-1))/2;
			}
		}
		return ans;
	}
}
