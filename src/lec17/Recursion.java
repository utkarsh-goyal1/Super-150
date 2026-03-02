//package lec17;
//import java.util.*;
//public class Recursion {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);//factorial using head recursion
//		int n=sc.nextInt();
//		System.out.println(fact(n));
//	}
//	public static int fact(int n)
//	{
//		if(n==0)
//		{
//			return 1;
//		}
//		return n*fact(n-1);.
//	}
//}
//Print Decreasing.
//package lec17;
//import java.util.*;
//public class Recursion {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		print(n);
//	}
//	public static void print(int n)
//	{
//		if(n==0)
//		{
//			return ;
//		}
//		System.out.println(n);
//		print(n-1);
//			
//		
//	}
//}
//Q-->Print increasing.
//package lec17;
//import java.util.*;
//public class Recursion {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		Increase(n);
//	}
//	public static void Increase(int n)      //Head recursion
//	{
//		if(n==0)
//		{
//			return;
//		}
//		Increase(n-1);
//		System.out.println(n);
//	}
//}
//Q-->print factorial using tail recursion.
//package lec17;
//import java.util.*;
//public class Recursion {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println(factorial(n,1));
//	}
//	public static int factorial(int n,int ans)
//	{
//		if(n==0)
//		{
//			return ans;
//		}
//		return factorial(n-1,ans*n);
//		
//	}
//}
