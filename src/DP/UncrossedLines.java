package DP;
class UncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
    int [][]dp=new int[nums1.length+1][nums2.length+1];
    return LCS(nums1,nums2,dp);
    }
    public static int LCS(int[] nums1,int[] nums2,int [][]dp)
	{
		
		for(int r=1;r<=nums1.length;r++)
		{
			for(int c=1;c<=nums2.length;c++)
			{
				if(nums1[r-1]==nums2[c-1])
				{
					dp[r][c]=dp[r-1][c-1]+1;
				}
				else
				{
					dp[r][c]=Math.max(dp[r-1][c],dp[r][c-1]);
				}
			}
		}
		return dp[nums1.length][nums2.length];
	}
}