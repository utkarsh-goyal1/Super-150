package lec26;
import java.util.*;
public class Maximum_score_of_a_good_subarray {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []A=new int [n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(max_score(A,k));
	}
	public static int max_score(int []A,int k)
	{
		Stack<Integer>st=new Stack<>();
		int ans=0;
		for(int i=0;i<A.length;i++)
		{
			while(!st.isEmpty() && A[i]<A[st.peek()])
			{
				int h=A[st.pop()];
				int r=i;
				if(r-1>=k)
				{
					if(!st.isEmpty())
					{
						int l=st.peek();
						if(l+1<=k)
						{
							int a=h*(r-l-1);
							ans=Math.max(ans, a);
						}
					}
					else
					{
						int a=h*r;
						ans=Math.max(ans,a);
					}
				}
			}
			st.push(i);
		}
		int r=A.length;
		while(!st.isEmpty())
		{
			int h=A[st.pop()];
			if(r-1>=k)
			{
				if(!st.isEmpty())
				{
					int l=st.peek();
					if(l+1<=k)
					{
						int a=h*(r-l-1);
						ans=Math.max(ans, a);
					}
				}
				else
				{
					int a=h*r;
					ans=Math.max(ans,a);
				}
			}
		}
		return ans;
	}
}
