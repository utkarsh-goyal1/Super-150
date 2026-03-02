package DP;
import java.util.*;
public class ValentineMagic {
	public static void main(String []args)
	{
		int []boys= {2,11,3};
		int []girls= {5,7,3,2};
		Arrays.sort(boys);
		Arrays.sort(girls);
		int [][]memo=new int[boys.length+1][girls.length+1];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i],-1);
		}
		System.out.println(minDiff(boys,girls,boys.length,girls.length,memo));
	}
	public static int minDiff(int []boys,int []girls,int i,int j,int [][]memo)
	{
		if(i==0)
		{
			return 0;
		}
		if(j==0)
		{
			return 9999999;
		}
		if(memo[i][j]!=-1)
		{
			return memo[i][j];
		}
		int pair=Math.abs(boys[i-1]-girls[j-1])+minDiff(boys,girls,i-1,j-1,memo);
		int no_pair=minDiff(boys,girls,i,j-1,memo);
		return memo[i][j]=Math.min(pair, no_pair);
	}
}
