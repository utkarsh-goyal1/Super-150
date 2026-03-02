/*package lec7;
import java.util.Scanner;
public class Selection_sort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		sorted(A);
	}
	public static void sorted(int []A)
	{
		for(int i=0;i<A.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[min])
				{
					min=j;
				}
			}
			int temp=A[min];
			A[min]=A[i];
			A[i]=temp;
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}*/

