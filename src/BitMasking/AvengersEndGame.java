package BitMasking;
import java.util.*;
public class AvengersEndGame {
	public static void main(String []args)
	{
		int []prime= {2,3,5,7,11,13,17,19};
		int n=18;
		System.out.println(count(prime,n));
	}
	public static int count(int[]prime,int n)
	{
		int len=prime.length;
		int ans=0;
		for(int i=1;i<(1<<len);i++)//iterate through all possible subsets of prime numbers
		{
			if((countsetbit(i)&1)!=0)//odd bit
			{
				ans+=Intersection(prime,n,i);
			}
			else//even bit
			{
				ans-=Intersection(prime,n,i);
			}
		}
		return ans;
	}
	public static int Intersection(int []prime,int n,int i)
	{
		int p=1;//product
		int pos=0;
		while(i>0) 
		{
			if((i&1)!=0)
			{
				p*=prime[pos];
			}
			pos++;
			i>>=1;
		}
		return n/p;
//		The Intersection method calculates the product of the prime numbers in the current subset and returns the count of numbers in the range 1 to n 
//		that are divisible by this product.
	}
	public static int countsetbit(int num)
	{
		int count=0;
		while(num>0)
		{
			num=(num&(num-1));
			count++;
		}
		return count;
	}
}

//Question---
//You are given a array of prime numbers and a number n. Find the count of numbers in the range from 1 to N which are divisible by at least one prime number in a given set of primes.



//Logic----

//The reason for adding the result to ans when the number of set bits is odd and subtracting when it's even is related to the inclusion-exclusion principle

//When the number of set bits in the binary representation of i is odd, it means that the subset corresponding to i is an odd-sized subset. 
//According to the inclusion-exclusion principle, we need to include the count of elements in this subset.


//When the number of set bits is even, it means that the subset corresponding to i is an even-sized subset.
//According to the inclusion-exclusion principle, we need to exclude the count of elements in this subset