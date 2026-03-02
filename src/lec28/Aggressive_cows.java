package lec28;
import java.util.*;
public class Aggressive_cows {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int cows=sc.nextInt();
		int stalls=sc.nextInt();
		int []A=new int[stalls];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		int low=A[0];
		int ans=0;
		int high=A[A.length-1];
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(check(A,mid,cows))
			{
				ans=mid;
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println(ans);
	}
	public static boolean check(int []A,int mid,int cows)
	{
		int temp=A[0];
		cows--;
		for(int i=1;i<A.length;i++)
		{
			if(A[i]-temp>=mid)
			{
				cows--;
				temp=A[i];
			}
			if(cows==0)
			{
				return true;
			}
		}
		return false;
	}
}
