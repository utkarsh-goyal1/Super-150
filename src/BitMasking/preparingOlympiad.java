package BitMasking;
import java.util.*;
public class preparingOlympiad {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		int []c = new int[n];
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		System.out.println(Count(c,n,l,r,x));
		
	}
	public static long Count(int []c,int n,int l,int r,int x)
	{
		long ans=0;
		for(int i=3;i<(1<<n);i++)
		{
			if(countsetbit(i)>=2 && isitPossible(c,i,l,r,x))
			{
				ans++;
			}
		}
		return ans;
	}
	public static boolean isitPossible(int []c,int i,int l,int r,int x)
	{
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int pos=0;
		while(i>0)
		{
			if((i&1)!=0)
			{
				sum+=c[pos];
				min=Math.min(min, c[pos]);
				max=Math.max(max, c[pos]);
			}
			pos++;
			i>>=1;
		}
		return sum>=l & sum<=r & max-min>=x;
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
