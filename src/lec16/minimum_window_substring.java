package lec16;
import java.util.*;
public class minimum_window_substring {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();//ADOBECODEBANC
		String t=sc.nextLine();//ABC
		System.out.println(Minimum_substring(S,t));
	}
	public static String Minimum_substring(String S,String t)
	{
		int []fret=new int[123];
		for(int i=0;i<t.length();i++)
		{
			char ch=t.charAt(i);
			fret[ch]++;
		}
		int []freS=new int[123];
		int s1=0;
		int e1=0;
		int start=-1;//if string is not find then to return empty string .
		int len=Integer.MAX_VALUE;
		int count=0;
		while(e1<S.length())
		{
			char ch=S.charAt(e1);
			freS[ch]++;
			if(fret[ch]>=freS[ch])
			{
				count++;
			}
			if(count==t.length())
			{
				
				while(freS[S.charAt(s1)]>fret[S.charAt(s1)])
				{
					freS[S.charAt(s1)]--;
					s1++;
				}
				if(len>e1-s1+1)
				{
					len=e1-s1+1;
					start=s1;
				}
			}
			
			e1++;
		}
		if(start==-1)
		{
			return "";
		}
		else {
			return S.substring(start,start+len);
		}
	}
}
