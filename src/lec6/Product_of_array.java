//package lec6;
//
//public class Product_of_array {//prefix algorithm.
//	
//	public static void main(String args[])
//	{
//		int []A= {1,2,3,4};
//		int []res=array_except_self(A);
//		for(int i=0;i<=A.length-1;i++)
//		{
//			System.out.print(res[i]+" ");
//		}
//	}
//	public static int[] array_except_self(int []A)
//	{
//		int []left=new int[A.length];
//		left[0]=1;
//		for(int i=1;i<=A.length-1;i++)
//		{
//			left[i]=left[i-1]*A[i-1];
//		}
//		int []right=new int[A.length];
//		right[A.length-1]=1;
//		for(int j=A.length-2;j>=0;j--)
//		{
//			right[j]=right[j+1]*A[j+1];
//		}
//		for(int k=0;k<=A.length-1;k++)
//		{
//			left[k]=left[k]*right[k];
//		}
//		return left;
//	}
//}

