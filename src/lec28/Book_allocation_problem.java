package lec28;
import java.util.*;
public class Book_allocation_problem {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int []A=new int[n];
			int sum=0;
			for(int j=0;j<A.length;j++)
			{
				A[j]=sc.nextInt();
				sum=sum+A[j];
			}
			int low=0;
			int ans=0;
			int high=sum;
			while(low<=high)
			{
				int mid=low+(high-low)/2;
				if(check(A,mid,m))
				{
					ans=mid;
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			System.out.println(ans);
		}
	}
	public static boolean check(int []A,int mid,int students)
	{
		int student=1;
		int readpage=0;
		int i=0;
		while(i<A.length)
		{
			if(readpage+A[i]<=mid)
			{
				readpage+=A[i];
				i++;
			}
			else
			{
				student++;
				readpage=0;
			}
			if(student>students)
			{
				return false;
			}
		}
		return true;
	}
}
