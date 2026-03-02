package lec15;
import java.util.*;
public class Sliding_window {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] A= new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(Maximum_Sum(A,k));
	}
	public static int Maximum_Sum(int []A,int k)
	{
		int max=0;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+A[i];
		}
		max=sum;
		for(int i=k;i<A.length;i++)
		{
			sum=sum+A[i];//window size increase or grow
			sum=sum-A[i-k];//window size decrease or shrink
			max=Math.max(max, sum);
		}
		return max;
	}
}
