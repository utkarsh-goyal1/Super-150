package lec22;
import java.util.*;
public class Axis_orbit_algorithm {
	public static void main(String []args)
	{
		String s="nitin";
		int count=Palindrome(s);
		System.out.print(count);
	}
	public static int Palindrome(String s)
	{
		int count=0;
		//odd length palindrome
		for(int axis=0;axis<s.length();axis++)
		{
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++)
			{
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit))
				{
					break;
				}
				count++;
			}
		}
		//for even length
		for(double axis=0.5;axis<s.length();axis++)
		{
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++)
			{
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
				{
					break;
				}
				count++;
			}
		}
		return count;
	}
}
