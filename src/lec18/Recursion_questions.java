//print all possible paths to reach at end in n*m matrix.
//Main Path
//package lec18;
//import java.util.*;
//public class Recursion_questions {
//	public static void main(String[]args)
//	{
//		int n=3;//row
//		int m=4;//col
//		String s="";
//		int cc=0;
//		int rr=0;
//		print(n,m,cc,rr,s);
//		System.out.println(count);
//	}
//	static int count=0;
//	public static void print(int n,int m,int cc,int rr,String s)
//	{
//		if(cc==n-1 && rr==m-1)
//		{
//			
//			System.out.print(s+" ");
//			count++;
//			return;
//		}
//		if(cc>=m || rr>=n)
//		{
//			return;
//		}
//		print(n,m,cc,rr+1,s+"V");
//		print(n,m,cc+1,rr,s+"H");
//	}
//}
//package lec18;
//import java.util.*;
//public class Recursion_questions {
//	public static void main(String[]args)
//	{
//		int n=3;//row
//		int m=3;//column
//		String ans="";
//		int cr=0;
//		int cc=0;
//		print(n,m,cr,cc,ans);
//	
//	}
//	public static void print(int n,int m,int cr,int cc,String ans)
//	{
//		if(cr==n-1 && cc==m-1)
//		{
//			System.out.print(ans+" ");
//			return ;
//		}
//		if(cr<=n )
//		{
//			print(n,m,cr+1,cc,ans+"V");
//		}
//		if(cc<=n)
//		{
//			print(n,m,cr,cc+1,ans+"H");
//		}
//	}
//}