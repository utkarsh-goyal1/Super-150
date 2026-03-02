//Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:
//The leftmost element of the subarray is not larger than other elements in the subarray.
//Input: [1,4,2,5,3]
//Output: 11
//Explanation: There are 11 valid subarrays: [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].

package AdvancedArray;
import java.util.*;
public class NumberOfValidSubArrays {
	public static void main(String []args)
	{
		int []A= {2,2,2};
		System.out.println(findCount(A));
	}
	public static int findCount(int []A)
	{
		Stack<Integer>st =new Stack<>();
		int count=0;
		for(int i=0;i<A.length;i++)
		{
			while(!st.isEmpty() && A[i]<A[st.peek()])
			{
				st.pop();
			}
			st.push(i);
			count+=st.size();
		}
		return count;
	}
}
//Maintain a monotonic stack.
//first element will be the valid sub array.
//Now we will put the first element into the stack.Now we will iterate the remaining array and check if peek element of the stack is 
//smaller than my current element then my current element will form a valid sub array with all the elements present in the stack.
//If the peek is greater, then pop the element until peek is smaller than my current.

