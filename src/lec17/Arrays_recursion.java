package lec17;
import java.util.*;
public class Arrays_recursion {
	public static void main(String []args)//last occurence of character in a array.
	{
		int []A= {2,3,7,2,5,7,9,7};
		int k=3;
		System.out.println(getindex(A,k,A.length-1));
	}
	public static int getindex(int []A,int item,int i)
	{
		if(i==-1)
		{
			return -1;
		}
		if(A[i]==item)
		{
			return i;
		}
		return getindex(A,item,i-1);
	}
}
//	public static int getindex(int []A,int item,int i)//First occurence of character in a array.
//	{
//		if(i==A.length)
//		{
//			return -1;
//		}
//		if(A[i]==item)
//		{
//			return i;
//		}
//		return getindex(A,item,i+1);
//		
//	}
//}
 
//package lec17;
//import java.util.*;
//public class Arrays_recursion {
//	public static void main(String []args)//all occurences of character in a array.
//	{
//		int []A= {2,3,7,2,5,7,9,7};
//		int k=7;
//		getindex(A,k,0);
//	}
//	public static void getindex(int []A,int k,int i)
//	{
//		if(i==A.length)
//		{
//			return;
//		}
//		if(A[i]==k)
//		{
//			System.out.println(i);
//		}
//		getindex(A,k,i+1);
//		
//	}
//	
//}