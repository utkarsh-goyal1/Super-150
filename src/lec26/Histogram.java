package lec26;
import java.util.*;
public class Histogram {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []A= {2,3,5,4,6,1,7};
		System.out.println(LargestRectangle(A));
	}
	public static int LargestRectangle(int []A)
	{
		int ans=0;
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<A.length;i++)
		{
			while(!st.isEmpty() && A[i]<A[st.peek()])
			{
				int h=A[st.pop()];
				int r=i;
				if(st.isEmpty())
				{
				int a=h*r;
				ans=Math.max(ans, a);
				}
				else
				{
					int l=st.peek();
					int a=h*(r-l-1);
					ans=Math.max(ans, a);
				}
			}
			st.push(i);
		}
		int r=A.length;
		while(!st.isEmpty())
		{
			int h=A[st.pop()];
			if(st.isEmpty())
			{
			int a=h*r;
			ans=Math.max(ans, a);
			}
			else
			{
				int l=st.peek();
				int a=h*(r-l-1);
				ans=Math.max(ans, a);
			}
		}
		return ans;
	}
}
