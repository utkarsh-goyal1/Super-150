package lec26;
import java.util.Stack;
import java.util.*;
public class Stock_span {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []A= {28,14,28,35,46,53,66,80,87,88};
		stock_span(A);
		
	}
	public static void stock_span(int []arr)
	{
		int []ans=new int[arr.length];
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>=arr[st.peek()])
			{
				st.pop();
			}
			if(st.empty())//it means that my current element is greater than all the elements which are left behind.
			{
				ans[i]=i+1;
			}
			else
			{
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}

