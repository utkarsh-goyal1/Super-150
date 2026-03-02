package lec7;
import java.util.Scanner;

public class Sorting {//Bubble Sort.
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		sorted(A);
		
	}
	public static void sorted(int []A)
	{
		for(int i=1;i<A.length;i++)//NO.of passes
		{
			for(int j=0;j<A.length-i;j++)//no.of comparisions.
			{
				if(A[j]>A[j+1])
				{
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				
			}
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
