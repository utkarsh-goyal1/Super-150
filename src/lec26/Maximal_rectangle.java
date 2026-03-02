package lec26;
import java.util.*;
public class Maximal_rectangle {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		char [][]matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		int [][]A=new int[matrix.length][matrix[0].length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=Character.getNumericValue(matrix[i][j]);
			}
		}
		int []res=new int[A[0].length];
		int n=matrix.length;
		res=A[n-1];
		int ans=LargestRectangle(res);
		for(int i=n-2;i>=0;i--)
		{
			for(int j=0;j<res.length;j++)
			{
				if(A[i][j]==1)
				{
					res[j]=res[j]+1;
				}
				else
				{
					res[j]=0;
				}
			}
			int area=LargestRectangle(res);
			ans=Math.max(ans,area);
		}
		System.out.println(ans);
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
