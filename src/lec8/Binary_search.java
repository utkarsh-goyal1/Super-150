//package lec8;
//
//import java.util.Scanner;
//
//public class Binary_search {
//	public static void main(String[]args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int []A=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			A[i]=sc.nextInt();
//		}
//		int num=sc.nextInt();
//		int c=binarysearch(A,num);
//		System.out.print(c);
//	}
//	public static int binarysearch(int []A,int num)
//	{
//		int n=A.length;
//		int low=0;
//		int high=n-1;
//		while(low<=high)
//		{
//			int mid=(low+high)/2;
//			if(A[mid]==num)
//			{
//				return mid;
//			}
//			else if(A[mid]>num)
//			{
//				high=mid-1;
//			}
//			else
//			{
//				low=mid+1;
//			}
//		}
//		return -1;
//		
//	}
//}
//