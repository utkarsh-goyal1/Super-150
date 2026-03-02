//package lec5;
//import java.util.*;
//public class Arrays 
//{
//	public static void main(String args[])
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int [] A=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			A[i]=sc.nextInt();
//		}
//		display(A);
//		
//	}
//	public static void display(int []A)
//	{
//		for(int i=0;i<A.length;i++)
//		{
//			System.out.println(A[i]);
//		}
//	}
//	
//}
package lec5;
import java.util.*;
public class Arrays 
{
	public static void main(String args[])
	{
		
		int [] A= {1,2,3,4,5};
		int [] B= {10,20,30,40,50};
		System.out.println(A[0]+" "+B[0]);
	    swap(A,B);
		System.out.println(A[0]+" "+B[0]);
		
	}
	public static void swap(int []A,int []B)
	{
		int []temp=A;
		A=B;
		B=temp;
	}
	
}
//That's why java is not call by reference.
//class like arrays is a non primitive datatype.it is stored in heap memory.name of the array form in stack memory.
//array.length is used to find length.it is a property of array class and not a function.
//array is a static.
//we can't print address of array in java.
//java is a call by value.
//java is not call by reference can be explained by swapping example.