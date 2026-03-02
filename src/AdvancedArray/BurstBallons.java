package AdvancedArray;
class BurstBallons{
	public static void main(String []args)
	{
		
	}
}
//class Solution {
//    public int maxCoins(int[] nums) {
//        int []A= new int[nums.length+2];
//        for(int i=1;i<A.length-1;i++)
//        {
//            A[i]=nums[i-1];
//        }
//        A[0]=1;
//        A[A.length-1]=1;
//        int [][]memo= new int[A.length][A.length];
//        for(int i=0;i<memo.length;i++)
//        Arrays.fill(memo[i],-1);
//        return MaxCoins(A,0,A.length-1,memo);
//    }
//    public static int MaxCoins(int []arr,int si,int ei,int [][]memo)
//    {
//        if(si+1==ei)
//        {
//            return 0;
//        }
//        if(memo[si][ei]!=-1)
//        {
//            return memo[si][ei];
//        }
//        int ans=Integer.MIN_VALUE;
//        for(int i=si+1;i<ei;i++)
//        {
//            int left=MaxCoins(arr,si,i,memo);
//            int right=MaxCoins(arr,i,ei,memo);
//            int self=arr[si]*arr[i]*arr[ei];
//            ans=Math.max(ans,left+right+self);
//        }
//        return memo[si][ei]=ans;
//    }
//}
