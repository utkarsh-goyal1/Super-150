package AdvancedArray;
import java.util.*;
public class TwoArraysAndSumOfFunctions {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int mod=998244353;
		int n = sc.nextInt();
		long []A = new long[n];
		for(int i=0;i<A.length;i++)
		{
			long a1=sc.nextLong();
			A[i]=a1*(i+1)*(n-i);
		}
		Integer []B= new Integer[n];
		for(int i=0;i<B.length;i++)
		{
			B[i]=sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		long ans=0;
		for(int i=0;i<A.length;i++)
		{
			ans=ans + (A[i] % mod)*B[i];
			ans=ans % mod;
		}
		System.out.println((int)ans);
	}
	
}
