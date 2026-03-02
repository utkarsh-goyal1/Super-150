//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
//You may assume that you have an infinite number of each kind of coin.
//The answer is guaranteed to fit into a signed 32-bit integer.
package DP;
import java.util.*;
public class CoinChange2 {
	public static void main(String []args)
	{
		int amount = 5;
		int []coins = {1,2,5};
		int [][]memo=new int[amount+1][coins.length+1];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i], -1);
		}
		for(int r=0;r<memo[0].length;r++)
		{
			memo[0][r]=1;
		}
		for(int i=0;i<memo.length;i++)
		{
			memo[i][0]=0;
		}
		for(int i=1;i<memo.length;i++)
		{
			for(int j=1;j<memo[0].length;j++)
			{
				int pick=0;
				int dontpick=0;
				if(i>=coins[j-1])
				{
					pick=memo[i-coins[j-1]][j];
				}
				dontpick=memo[i][j-1];
				memo[i][j]=pick+dontpick;
			}
		}
		System.out.println(memo[amount][coins.length]);
		//System.out.println(ways(coins,amount,coins.length,memo));
	}
//	public static int findWays(int amount,int []coins,int index,int [][]memo)
//    {
//        if(amount==0)
//        {
//            return 1;
//        }
//        if(index==0)
//        {
//            return 0;
//        }
//        if(memo[amount][index]!=-1)
//        {
//            return memo[amount][index];
//        }
//        int pick=0;
//        if(amount>=coins[index-1])
//        {
//            pick=findWays(amount-coins[index-1],coins,index,memo);
//        }
//        int dontpick=findWays(amount,coins,index-1,memo);
//        return memo[amount][index]=pick+dontpick;
//    }
}
