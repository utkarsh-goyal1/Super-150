package lec21;
import java.util.*;
public class Quick_sort {
	public static void main(String []args)
	{
		int []A= {5,7,2,3,8,9,1,4};
		sort(A,0,A.length-1);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static  void sort(int []A,int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int pi=partition(A,si,ei);
		sort(A,si,pi-1);
		sort(A,pi+1,ei);
	}
	public static int partition(int []A,int si,int ei)
	{
		int item=A[ei];
		int pi=si;
		for(int i=si;i<ei;i++)
		{
			if(A[i]<=item)
			{
				swap(A,i,pi);
				pi++;
			}
		}
		int temp=A[pi];
		A[pi]=A[ei];
		A[ei]=temp;
		return pi;
	}
	public static void swap(int []A,int a,int b)
	{
		int temp=A[a];
		A[a]=A[b];
		A[b]=temp;
	}
}

