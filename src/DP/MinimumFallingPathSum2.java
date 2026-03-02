package DP;
import java.util.*;
class MinimumFallingPathSum2 {
    public int minFallingPathSum(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int [][]memo=new int[matrix.length][matrix[0].length];
        for(int i=0;i<memo.length;i++)
        {
            Arrays.fill(memo[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            res.add(find(matrix,matrix.length-1,i,memo));
        }
        return Collections.min(res);
    }
    public static int find(int [][]matrix,int cr,int cc,int [][]memo)
    {
    	if(cc>=matrix[0].length)
    	{
    		return Integer.MAX_VALUE;
    	}
    	if(cr==0)
    	{
    		return matrix[cr][cc];
    	}
    	int res=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++)
        {
        	if(cc!=i)
        	{
        		res=Math.min(res,find(matrix,cr-1,i,memo));
        	}
        }
        return res+matrix[cr][cc];
    }
}