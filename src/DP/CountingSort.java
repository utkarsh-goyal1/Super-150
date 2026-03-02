package DP;
import java.util.*;
public class CountingSort {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int []res=sort(A);
		System.out.println(Arrays.toString(res));
	}
	public static int []sort(int []A)
	{
		int max=Arrays.stream(A).max().getAsInt();
		int []freq=new int[max+1];
		for(int i=0;i<A.length;i++)
		{
			freq[A[i]]++;
		}
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i-1]+freq[i];
		}
		int []ans=new int[A.length];
		for(int i=A.length-1;i>=0;i--)
		{
			int c=freq[A[i]]-1;
			ans[c]=A[i];
			freq[A[i]]--;
		}
		return ans;
	}
}
