package lec7;
import java.util.*;
public class Insertion_sort {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		} 
		sort(A);
	}
	public static void sort(int []A)
	{
		for(int i=1;i<A.length;i++)
		{
			int item=A[i];
			int j=i-1;
			while(j>=0 && A[j]>item)
			{
				A[j+1]=A[j];
				j--;
			}
			j++;
			A[j]=item;
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
