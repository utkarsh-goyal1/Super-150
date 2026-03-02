//Q-print all the subsequence of string.
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		String s="abc";
//		subsequence(s,"");
//	}
//	public static void subsequence(String s,String emp)
//	{
//		if(s.length()==0)
//		{
//			System.out.print(emp+" ");
//			return ;
//		}
//		char ch=s.charAt(0);
//		subsequence(s.substring(1),emp);
//		subsequence(s.substring(1),emp+ch);
//	}
//}
//Q-print all the subsequence of a string except duplicates.
//package lec17;
//import java.util.*;
//public class String_recursion{
//	public static void main(String[]args)
//	{
//		String s="aac";
//		char []A=s.toCharArray();
//      Arrays.sort(A);
//		subsequence(A,"",0);
//	}
//	public static void subsequence(char []A,String ans,int index)
//	{
//		if(index>=A.length)
//		{
//			System.out.print(ans+" ");
//			return ;
//		}
//		char ch=A[index];
//      subsequence(A,ans+A[index],index+1);
//      while(index+1<A.length && A[index]==A[index+1])//first of all we will call for all characters and make the subsequences (add characters call) 
//      {											   //and when we call for skip (2nd choice) then we will check if the characters present further
//              index++;							   //are same then we will skip the call because we have already made the answers for that call.
//      }
//		subsequence(A,ans,index+1);
//		
//	}
//}
//Q-print all combinations of coins.
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		int n=3;
//		String ans="";
//		getcoins(n,ans);
//	}
//	public static void getcoins(int n,String ans)
//	{
//		if(n==0)
//		{
//			System.out.print(ans+" ");
//			return ;
//		}
//		getcoins(n-1,ans+"H");
//		getcoins(n-1,ans+"T");
//	}
//}
//Q--Print all the combinations  on tossing n coins except in which head occurs together. 
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		int n=3;
//		String ans="";
//		getcoins(n,ans);
//	}
//	public static void getcoins(int n,String ans)
//	{
//		if(n==0)
//		{
//			System.out.print(ans+" ");
//			return ;
//		}
//		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
//		{
//			getcoins(n-1,ans+"H");
//		}
//		getcoins(n-1,ans+"T");
//	}
//}
//Q-count all the subsequence of string.
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		String s="abc";
//		String ans="";
//		subsequence(s,ans);
//		System.out.println(count);
//	}
//	static int count=0;
//	public static void subsequence(String s,String emp)
//	{
//		if(s.length()==0)
//		{
//			count++;
//			return ;
//		}
//		char ch=s.charAt(0);
//		subsequence(s.substring(1),emp);
//		subsequence(s.substring(1),emp+ch);
//	}
//}
//Q-count all the subsequence of string.
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)//without static variable.
//	{
//		String s="abc";
//		String ans="";
//		
//		System.out.println(subsequence(s,ans));
//	}
//	public static int subsequence(String s,String emp)
//	{
//		if(s.length()==0)
//		{
//			
//			return 1;
//		}
//		char ch=s.charAt(0);
//		int a=subsequence(s.substring(1),emp);
//		int b=subsequence(s.substring(1),emp+ch);
//		return a+b;
//	}
//}




//Q-print  count all combinations of coins.
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		int n=3;
//		String ans="";
//		System.out.println(getcoins(n,ans));
//	}
//	public static int getcoins(int n,String ans)
//	{
//		if(n==0)
//		{
//			
//			return 1;
//		}
//		int  a=getcoins(n-1,ans+"H");
//		int b=getcoins(n-1,ans+"T");
//		return a+b;
//	}
//}




//Q--count all the combinations  on tossing n coins except in which head occurs together. 
//package lec17;
//import java.util.*;
//public class String_recursion {
//	public static void main(String[]args)
//	{
//		int n=3;
//		String ans="";
//		System.out.println(getcoins(n,ans));
//	}
//	public static int getcoins(int n,String ans)
//	{
//		
//		if(n==0)
//		{
//			
//			return 1;
//		}
//		int a=0;
//		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
//		{
//			a=getcoins(n-1,ans+"H");
//		}
//		int b=getcoins(n-1,ans+"T");
//		return a+b;
//	}
//}
