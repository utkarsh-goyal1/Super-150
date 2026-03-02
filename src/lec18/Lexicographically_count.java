package lec18;
import java.util.*;
public class Lexicographically_count {
	public static void main(String []args)
	{
		int n=13;
		int curr=0;
		printcounting(curr,n);
	}
	public static void printcounting(int curr,int n)
	{
		if(curr>n)
		{
			return;
		}
		if(curr!=0)
		System.out.print(curr+" ");
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			printcounting(curr*10+i,n);
		}
	}
}
