//package DP;
//
//public class MinCostToClimbStairs {
//
//}
//class Solution {
//    public int minCostClimbingStairs(int[] cost) {
//        int []memo=new int[cost.length+1];
//        Arrays.fill(memo,Integer.MAX_VALUE);
//        memo[cost.length]=0;
//        int cost1=getCost(cost,0,memo);//get the cost if we are starting from 0th index.
//        int cost2=getCost(cost,1,memo);//get the cost if we are starting from 1th index.
//        return Math.min(cost1,cost2);//return the minimum of both.
//    }
//    public static int getCost(int []costs,int index,int []memo)
//    {
//        if(index>=costs.length)
//        {
//            return 0;
//        }
//        if(memo[index]!=Integer.MAX_VALUE)
//        {
//            return memo[index];
//        }
//        int c1=getCost(costs,index+1,memo);
//        //calculate the cost if we climb only one stair .
//        int c2=getCost(costs,index+2,memo);
//        //calculate the cost if we climb two stairs.
//        return memo[index]=Math.min(c1,c2)+costs[index];
//    }
//}