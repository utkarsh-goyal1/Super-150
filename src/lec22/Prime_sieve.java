package lec22;
import java.util.*;
public class Prime_sieve {
	public static void main(String []args)//complexity is O(n*log*log(n)).
	{
		Primesieve(100);
	}
	public static void Primesieve(int n)
	{
		boolean []prime=new boolean[n+1];//false denotes number is prime.
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
		for(int i=0;i<prime.length;i++)
		{
			if(prime[i]==false)
			{
				System.out.println(i+" ");
			}
		}
	}
}
