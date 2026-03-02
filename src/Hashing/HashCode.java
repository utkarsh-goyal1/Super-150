package Hashing;
import java.util.*;
public class HashCode {
	public static void main(String []args)
	{
		String str="Apple";
		System.out.println(hashcode(str));
	}
	public static long hashcode(String str)
	{
		long mod=1000_000_007;
		long pow=1;
		long p=31;//prime
		long hv=0;//hash value;
		for(int i=0;i<str.length();i++)
		{
			int pos=str.charAt(i)-'A'+1;//extract the character and find the value of it.
			hv=(hv+(pos*pow)%mod)%mod;//updating the hash value by adding it to the next value.
			pow=(pow*p)%mod;//updating the value of prime^pow.
		}
		return hv;
	}
}
