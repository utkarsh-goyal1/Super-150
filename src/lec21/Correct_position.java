package lec21;
import java.util.*;
public class Correct_position {
	public static void main(String []args)
	{
		int []A= {1,4,2,2,5,3};
		int index=partition(A,0,A.length-1);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
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