package AdvancedArray;
import java.util.*;
public class KnightDialer {
	public static void main(String []args)
	{
		
	}
}
//class Solution {
//    public int knightDialer(int n) {
//		int ans=0;
//        int [][][]dp = new int[n][4][3];
//        for(int i=0;i<dp.length;i++)
//        {
//            for(int j=0;j<dp[0].length;j++)
//            {
//                for(int k=0;k<dp[0][0].length;k++)
//                {
//                    dp[i][j][k]=-1;
//                }
//            }
//        }
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				ans=ans+Count(n-1,i,j,dp);
//                ans=ans%1000_000_007;
//			}
//		}
//        return ans;
//    }
//    public static int Count(int n,int cr,int cc,int [][][]dp)
//	{
//		if(cr<0 || cc<0 || cr>=4 || cc>=3 || (cr==3 && (cc==0 || cc==2)))
//		{
//			return 0;
//		}
//		if(n==0)
//		{
//			return 1;
//		}
//        if(dp[n][cr][cc]!=-1)
//        {
//            return dp[n][cr][cc];
//        }
//		int []r= {-2,-2,2,2,1,1,-1,-1};
//		int []c= {-1,1,-1,1,-2,2,-2,2};
//		int ans=0;
//		for(int i=0;i<c.length;i++)
//		{
//			ans=(ans+Count(n-1,cc+c[i],cr+r[i],dp))%1000_000_007;
//		}
//		return dp[n][cr][cc]=ans%1000_000_007;
//	}
//}

