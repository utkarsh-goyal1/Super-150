package Oops2;

import java.util.Arrays;
import java.util.Comparator;

public class Cars_Client {
	public static void main(String []args)
	{
		Cars []ar=new Cars[5];
		ar[0]=new Cars(200,10,"White");
		ar[1]=new Cars(1000,20,"Black");
		ar[2]=new Cars(345,3,"Yellow");
		ar[3]=new Cars(34,89,"Grey");
		ar[4]=new Cars(8907,6,"Red");
		Arrays.sort(ar,new Comparator<Cars>()
		{
			@Override
			public int compare(Cars o1,Cars o2)
			{
				return o1.speed-o2.speed;
			}
		});
		//sorted(ar);
		//sorted(ar,new CarComparatorSpeed());//by using comparator speed function.
		//sorted(ar,new CarComparatorPrice());//by using comparator price function.
		//sorted(ar,new CarComparatorColor());//by using comparator color function.
		//Display(ar);
	}
	public static void Display(Cars[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	//BY USING COMPARABLE INTERFACE
//	public static <T extends Comparable <T>>void sorted(T []A)//set the bound of function to ensure that it will receive only that T which have the logic of comparision.
//	{
//		for(int i=1;i<A.length;i++)//NO.of passes
//		{
//			for(int j=0;j<A.length-i;j++)//no.of comparisions.
//			{
//				if(A[j].compareTo(A[j+1])>0)
//				{
//					T temp=A[j];
//					A[j]=A[j+1];
//					A[j+1]=temp;
//				}
//				
//			}
//		}
//		for(int i=0;i<A.length;i++)
//		{
//			System.out.println(A[i]+" ");
//		}
//	}
	
	//BY USING COMPARATOR INTERFACE
//	public static <T>void sorted(T []A,Comparator<T>camp)
//	{
//		for(int i=1;i<A.length;i++)//NO.of passes
//		{
//			for(int j=0;j<A.length-i;j++)//no.of comparisions.
//			{
//				if(camp.compare(A[j],A[j+1])>0)
//				{
//					T temp=A[j];
//					A[j]=A[j+1];
//					A[j+1]=temp;
//				}
//				
//			}
//		}
//		for(int i=0;i<A.length;i++)
//		{
//			System.out.println(A[i]+" ");
//		}
//	}
}





