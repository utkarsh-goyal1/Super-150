package DP;
import java.util.*;
public class  OptimalStrategyGame  {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int val=find(A,0,A.length-1);
		System.out.println(val);
    }
	public static int find(int []nums,int i,int j)
    {
        if(i==j)
        {
            return nums[i];
        }
        if(i+1==j)
        {
            return Math.max(nums[i],nums[j]);
        }
        return Math.max(nums[i]+Math.min(find(nums,i+2,j),find(nums,i+1,j-1)),nums[j]+Math.min(find(nums,i+1,j-1),find(nums,i,j-2)));
    }
}
