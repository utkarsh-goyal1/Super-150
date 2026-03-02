//package DP;
//
//public class HouseRobber {
//
//}
//class Solution {
//    public int rob(int[] nums) {
//        if(nums.length==1)
//        {
//            return nums[0];
//        }
//        // int []memo=new int[nums.length+1];
//        // Arrays.fill(memo,-1);
//        // return HouseRobber(nums,memo,nums.length-1);
//        int []dp=new int[nums.length+1];
//        Arrays.fill(dp,-1);
//        return money(nums,dp);
//    }
//    public static int money(int []nums,int []dp)
//    {
//        dp[0]=0;
//        dp[1]=nums[0];
//        for(int i=2;i<dp.length;i++)
//        {             
//            int rob=nums[i-1]+dp[i-2];
//            int dontRob=dp[i-1];
//            dp[i]=Math.max(rob,dontRob);
//        }
//        return dp[nums.length];
//    }
    //from right to left
    // public static int HouseRobber(int []nums,int []memo,int src)
    // {
    //     if(src<0)
    //     {
    //         return 0;
    //     }
    //     if(memo[src]!=-1)
    //     {
    //         return memo[src];
    //     }
    //     int rob=HouseRobber(nums,memo,src-2)+nums[src];
    //     int dontRob=HouseRobber(nums,memo,src-1);
    //     memo[src]=Math.max(rob,dontRob);
    //     return memo[src];
    // }
    
    //from left to right.
    // public static int HouseRobber(int []nums,int []memo, int src)
    // {
    //     if(src>=nums.length)
    //     {
    //         return 0;
    //     }
    //     if(memo[src]!=-1)
    //     {
    //         return memo[src];
    //     }
    //     int rob=HouseRobber(nums,memo,src+2)+nums[src];
    //     int dontRob=HouseRobber(nums,memo,src+1);
    //     memo[src]=Math.max(rob,dontRob);
    //     return memo[src];
    // }
//}