//print permutations of string except duplicates.
//package lec18;
//import java.util.*;
//public class Tricky_permutations {
//	public static void main(String[]args)
//	{
//		String s ="abca";
//		String ans="";
//		ArrayList<String>List=new ArrayList<>();
//		permutations(s,ans,List);
//		for(int i=0;i<List.size();i++)
//		{
//			System.out.print(List.get(i)+" ");
//		}
//	}
//	public static void permutations(String s,String ans,ArrayList<String>List)
//	{
//		if(s.length()==0)
//		{
//			if(!List.contains(ans))
//			{
//				List.add(ans);
//			}
//			return;
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			String s1=s.substring(0,i);
//			String s2=s.substring(i+1);
//			char ch=s.charAt(i);
//			permutations(s1+s2,ans+ch,List);
//		}
//	}
//}

package lec18;
import java.util.*;
public class Tricky_permutations {
	public static void main(String[]args)
	{
		String s ="abca";
		String ans="";
		permutations(s,ans);
	}
	public static void permutations(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<s.length();j++)//if the character at current position is present in the remaining string then we will not call function.
			{
				if(s.charAt(j)==ch)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				String s1=s.substring(0,i);
				String s2=s.substring(i+1);
				permutations(s1+s2,ans+ch);
			}
		}
	}
}

