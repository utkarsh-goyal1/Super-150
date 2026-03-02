package lec28;
import java.util.*;
public class OnlyLadders {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []ladders=makeLadders(n);
		path(n,0,ladders,"");
		System.out.println();
		System.out.println(count);
		
	}
	static int count=0;
	public static void path(int n,int cc,int []ladder,String ans)
	{
		if(cc==n)
		{
			System.out.print(ans+"END , ");
			count++;
			return ;  
		}
		if(cc>n)
		{
			return ;
		}
		if(ladder[cc]!=0)
		{
			path(n,ladder[cc],ladder,ans+cc+" ");
		}
		else
		{
			for(int dice=1;dice<=6;dice++)
			{
				path(n,cc+dice,ladder,ans+cc+" ");
			}
		}
	}
	public static int []makeLadders(int n)
	{
		boolean []prime=Primesieve(n);
		int []ladders=new int[n+1];
		int i=0;
		int j=ladders.length-1;
		while(i<j)
		{
			while(i<prime.length && prime[i]==true)
			{
				i++;//here we are searching for the first  prime number in the range.
			}
			while(j>=0 && prime[j]==true)
			{
				j--;//here we are searching for the last prime number in the range.
			}
			if(i<j)
			{
				ladders[i]=j;
				i++;
				j--;
			}
		}
		return ladders;
	}
	public static boolean[] Primesieve(int n)
	{
		boolean []prime=new boolean[n+1];
		prime[0]=prime[1]=true;
		for(int i=2;i*i<prime.length;i++)
		{
			if(prime[i]==false)
			{
				for(int k=2;k*i<prime.length;k++)
				{
					prime[i*k]=true;
				}
			}
		}
		return prime;
	}
}
