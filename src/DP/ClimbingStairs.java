//package DP;
//
//public class ClimbingStairs {
//
//}

//class Solution {
//    public int climbStairs(int n) {
//        int []dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        return findSteps(n,dp);
//    }
//    public static int findSteps(int n,int []dp)
//    {
//        dp[0]=1;
//        dp[1]=1;
//        for(int i=2;i<dp.length;i++)
//        {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
//}
