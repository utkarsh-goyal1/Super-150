package DP;
import java.util.*;
public class MinimumFallingPathSum {
	public static void main(String []args)
	{
		int[][]matrix = {{2,1,3},{6,5,4},{7,8,9}};
		int res=Integer.MAX_VALUE;
		int[][]memo=new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++)
		{
			Arrays.fill(memo[i],Integer.MAX_VALUE);
		}
		for(int i=0;i<matrix[0].length;i++)
		{
			res=Math.min(res, find(matrix,0,i,memo));
		}
		System.out.println(res);
	}
	public static int find(int [][]matrix,int cr,int cc,int [][]memo)
	{
		if(cc<0 || cc>=matrix[0].length)
		{
			return Integer.MAX_VALUE;
		}
		if(cr==matrix.length-1)
		{
			return matrix[cr][cc];
		}
		if(memo[cr][cc]!=Integer.MAX_VALUE)
		{
			return memo[cr][cc];
		}
		int dl=find(matrix,cr+1,cc-1,memo);
		int b=find(matrix,cr+1,cc,memo);
		int dr=find(matrix,cr+1,cc+1,memo);
		return memo[cr][cc]=Math.min(dl, Math.min(b, dr))+matrix[cr][cc];
	}
}
