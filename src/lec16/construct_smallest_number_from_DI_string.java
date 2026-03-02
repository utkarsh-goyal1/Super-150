//package lec16;
//import java.util.*;
//public class construct_smallest_number_from_DI_string {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
//		int []A=new int[s.length()+1];
//		int count=1;
//		for(int i=0;i<A.length;i++)
//		{
//			if(i==s.length() || s.charAt(i)=='I')
//			{
//				A[i]=count;
//				count++;
//				for(int j=i-1;j>=0 && s.charAt(j)!='I';j--)
//				{
//					A[j]=count;
//					count++;
//				}
//			}
//		}
//		String snew="";
//		for(int i=0;i<A.length;i++)
//		{
//			snew+=A[i];
//		}
//		System.out.print(snew);
//	}
//	
//}