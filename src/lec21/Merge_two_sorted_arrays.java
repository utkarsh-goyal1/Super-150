package lec21;
import java.util.*;
public class Merge_two_sorted_arrays {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int []A=new int[m];
		int []B=new int[n];
		for(int i=0;i<m;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			B[i]=sc.nextInt();
		}
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
		for(int t=0;t<res.length;t++)
		{
			System.out.print(res[t]+" ");
		}
	}
	
}
