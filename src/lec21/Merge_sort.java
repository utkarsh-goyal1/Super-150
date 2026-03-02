package lec21;
import java.util.*;
public class Merge_sort {
	public static void main(String []args)
	{
		int []A= {2,7,9,1,5};
		A=merge(A,0,A.length-1);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static int [] merge(int []A,int si,int ei)
	{
		if(si==ei)
		{
			int []bs=new int[1];
			bs[0]=A[si];
			return bs;
		}
		int mid=(si+ei)/2;
		int []fa=merge(A,si,mid);
		int []sa=merge(A,mid+1,ei);
		return mergeArray(fa,sa);
	}
	public static int [] mergeArray(int []A,int []B)
	{
		int m=A.length;
		int n=B.length;
		int []res=new int[m+n];
		int i=0;
		int j=0;
		int c=0;
		while(i<m && j<n)
		{
			if(A[i]<B[j])
			{
				res[c++]=A[i];
				i++;
			}
			else
			{
				res[c++]=B[j];
				j++;
			}
		}
		while(i<m)
		{
			res[c++]=A[i];
			i++;
		}
		while(j<n)
		{
			res[c++]=B[j];
			j++;
		}
		return res;
	}
}
