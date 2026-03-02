//print permutations of a string.
//package lec18;
//import java.util.*;
//public class String_permutations {
//	public static void main(String[]args)
//	{
//		String s ="abca";
//		String ans="";
//		permutations(s,ans);
//	}
//	public static void permutations(String s,String ans)
//	{
//		if(s.length()==0)
//		{
//			System.out.println(ans+" ");
//			return;
//		} 
//		for(int i=0;i<s.length();i++)
//		{
//			String s1=s.substring(0,i);
//			String s2=s.substring(i+1);
//			char ch=s.charAt(i);
//			permutations(s1+s2,ans+ch);
//		}
//	}
//}
//package lec18;
//import java.util.*;
//public class String_permutations {
//	public static void main(String[]args)
//	{
//		String s ="abc";
//		String ans="";
//		int c=print(s,ans);
//		System.out.println(c);
//	}
//	static int count=0;
//	public static int print(String s,String ans)
//	{
//		if(s.length()==0)
//		{
//			System.out.println(ans);
//			count++;
//			return 1;
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			String s1=s.substring(0,i);
//			String s2=s.substring(i+1);
//			print(s1+s2,ans+ch);
//		}
//		return count;
//	}
//}
