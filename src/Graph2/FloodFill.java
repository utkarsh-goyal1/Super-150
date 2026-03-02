package Graph2;

public class FloodFill {
	//using dfs
	class Solution {
	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        int [][]ans = new int[image.length][image[0].length];
	        for(int i=0;i<ans.length;i++)
	        {
	            for(int j=0;j<ans[0].length;j++)
	            {
	                ans[i][j]=image[i][j];
	            }
	        }
	        int myColor=image[sr][sc];
	        boolean [][]visited= new boolean [ans.length][ans[0].length];
	        fill(ans,image,sr,sc,color,myColor,visited);
	        return ans;
	    }
	    public static void fill(int [][]ans,int [][]image,int sr,int sc,int color,int myColor,boolean [][]visited)
	    {
	        if(sr<0 || sc<0 || sr>=ans.length || sc>=ans[0].length || image[sr][sc]!=myColor || visited[sr][sc]==true)
	        {
	            return ;
	        }
	        if(image[sr][sc]==myColor)
	        {
	            ans[sr][sc]=color;
	        }
	        visited[sr][sc]=true;
	        fill(ans,image,sr-1,sc,color,myColor,visited);
	        fill(ans,image,sr,sc+1,color,myColor,visited);
	        fill(ans,image,sr+1,sc,color,myColor,visited);
	        fill(ans,image,sr,sc-1,color,myColor,visited);
	    }
	}
	//using recursion+Backtracking
//	class Solution {
	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        int [][]ans = new int[image.length][image[0].length];
	        for(int i=0;i<ans.length;i++)
	        {
	            for(int j=0;j<ans[0].length;j++)
	            {
	                ans[i][j]=image[i][j];
	            }
	        }
	        int myColor=image[sr][sc];
	        fill(ans,image,sr,sc,color,myColor);
	        return ans;
	    }
	    public static void fill(int [][]ans,int [][]image,int sr,int sc,int color,int myColor)
	    {
	        if(sr<0 || sc<0 || sr>=ans.length || sc>=ans[0].length || image[sr][sc]!=myColor)
	        {
	            return ;
	        }
	        if(image[sr][sc]==myColor)
	        {
	            ans[sr][sc]=color;
	        }
	        
	        int val=image[sr][sc];
	        image[sr][sc]=-1;
	        fill(ans,image,sr-1,sc,color,myColor);
	        fill(ans,image,sr,sc+1,color,myColor);
	        fill(ans,image,sr+1,sc,color,myColor);
	        fill(ans,image,sr,sc-1,color,myColor);
	        image[sr][sc]=val;
	    }
	}
//}
