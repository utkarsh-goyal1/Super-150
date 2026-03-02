package DP;
import java.util.*;
public class o1Knapsack {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cap=sc.nextInt();
		int []size=new int[n];
		int [][]memo=new int[cap+1][n+1];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i],-1);
		}
		for(int i=0;i<n;i++)
		{
			size[i]=sc.nextInt();
		}
		int []price=new int[n];
		for(int i=0;i<n;i++)
		{
			price[i]=sc.nextInt();
		}
		System.out.println(count(size,price,cap,n,memo));
    }
	public static int count(int []size,int []price,int cap,int index,int [][]memo)
	{
		if(index==0 || cap==0)
		{
			return 0;
		}
		if(memo[cap][index]!=-1)
		{
			return memo[cap][index];
		}
		int rob=0;
		int leave=0;
		if(size[index-1]<=cap)
		{
			rob=count(size,price,cap-size[index-1],index-1,memo)+price[index-1];
		}
		leave=count(size,price,cap,index-1,memo);
		return memo[cap][index]=Math.max(rob,leave);
	}
}
