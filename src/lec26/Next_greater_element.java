package lec26;
import java.util.*;
public class Next_greater_element {
	public static void main(String []args)
	{
		int []arr= {11,2,3,23,13,9,15};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		NGE(arr);
	}
	public static void NGE(int []arr)
	{
		int []ans=new int[arr.length];
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()])
			{
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}
//Hint->Without finding the next greater element of the current element,  try to find that element for which my current element will work as a next greater element.So we have to keep 
//track of the elements which have passed or remains behind.We know the data structure that can track past or element which are left behind that is stack.
