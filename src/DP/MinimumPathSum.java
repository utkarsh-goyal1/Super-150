package DP;
import java.util.*;
public class MinimumPathSum {
	public static void main(String []args)
	{
		int [][]grid = {{1,3,1},{1,5,1},{4,2,1}};
		int [][]memo=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            Arrays.fill(memo[i],-1);
        }
        System.out.println(print(grid,0,0,memo));
	}
    public static int print(int [][]A,int cr,int cc,int [][]memo)
    {
        if(cr==A.length-1 && cc==A[0].length-1)
        {
            return A[cr][cc];
        }
        if(cr>=A.length || cc>=A[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(memo[cr][cc]!=-1)
        {
            return memo[cr][cc];
        }
		int cost1=print(A,cr,cc+1,memo);
		int cost2=print(A,cr+1,cc,memo);
        memo[cr][cc]= Math.min(cost1,cost2)+A[cr][cc];
        return memo[cr][cc];
    }

}
