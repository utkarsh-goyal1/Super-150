/*package lec9;
import java.util.*;
public class Kth_root_binary_search {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int c=kthroot(k,n);
		System.out.print(c);
	}
	public static int kthroot(int k,int n)
	{
		int low=1;
		int high=n;
		int ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(Math.pow(mid,k)<=n)
			{
				ans=mid;
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return ans;
	}
}*/
//here we have to find maximum value of k so we move towards right(low=mid+1).