package Hashing;
import java.util.*;
public class RabinCarp {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s= sc.next();
			String pattern = sc.next();
			Pattern(s,pattern);
		}
	}
	public static void Pattern(String s,String p)
	{
		//find the hashcode of pattern p
		long mod=1000_000_007;
		long pow=1;
		long pr=31;
		long hv=0;
		for(int i=0;i<p.length();i++)//Here we are finding the HashCode of the pattern p.
		{
			int pos=p.charAt(i)-'a'+1;
			hv=(hv+(pos*pow)%mod)%mod;
			pow=(pow*pr)%mod;
		}
		long []dp = new long[s.length()];//this array will keep the HashCode of string till that index.
		long [] pa = new long[s.length()];
		dp[0]=s.charAt(0)-'a'+1;
		pa[0]=1;
		pow=31;
		for(int i=1;i<dp.length;i++)
		{
			dp[i]=(dp[i-1]+((s.charAt(i)-'a'+1)*pow)%mod)%mod;
			pa[i]=pow;
			pow=(pow*pr)%mod;
		}
		//Pattern matching using sliding window technique
		List<Integer>li = new ArrayList<>();
		for(int ei=p.length()-1,si=0;ei<s.length();ei++,si++)
		{
			long curr=dp[ei];
			if(si>0)
			{
				curr=curr-dp[si-1];
				curr=(curr+mod)%mod;
			}
			if(curr==((hv*pa[si])%mod))
			{
				li.add(si+1);
			}
		}
		if(li.size()==0)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(li.size());
			for(int i=0;i<li.size();i++)
			{
				System.out.print(li.get(i)+" ");
			}
		}
	}
}

//Algorithm is used for pattern matching
//we can also do this question using fixed size sliding window.
//In this algorithm also we are calculating the HashCode for each substring and comparing that HashCode with the HashCode of the pattern and if they get match put the  index
//into the ArrayList.
