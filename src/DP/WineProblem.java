package DP;
import java.util.*;
//Question->You are given a array prices consist of price of the ith bottle of wine.You wants to maximize your profit by selling them.
//Every time you can either sell first bottle or last bottle.When you sell your any bottle then its total cost is calculated by 
//multiplying the price of bottle with the turn(means on which turn).
public class WineProblem {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int max=Math.max(a,Math.max(b, c));
		    int min=Math.min(a, Math.min(b, c));
		    int mid=0;
		    if(a==max && b==min || a==min && b==max)mid=c;
		    else if(b==max && c==min || c==max && b==min)mid=a;
		    else	mid=b;
		    int count=0;
		    if(max!=0)
		    {
		    	count++;
		    	max--;
		    }
		    if(mid!=0)
		    {
		    	count++;
		    	mid--;
		    }
		    if(min!=0)
		    {
		    	count++;
		    	min--;
		    }
		    if(max!=0 && mid!=0)
		    {
		    	max--;
		    	mid--;
		    	count++;
		    }
		    if(max!=0 && min!=0)
		    {
		    	max--;
		    	min--;
		    	count++;
		    }
		    if(mid!=0 && min!=0)
		    {
		    	min--;
		    	mid--;
		    	count++;
		    }
		    if(max!=0 && mid!=0 && min!=0)
		    {
		    	count++;
		    }
		    System.out.println(count);
		    
		    	
		}
		//int []wine= {2,3,5,1,4};
		//System.out.println(Wine(wine,0,wine.length-1,1));
		//System.out.println(maximum_profit(wine));
	}
//	public static int Wine(int []wine,int i,int j,int year)
//	{
//		if(i>j)
//		{
//			return 0;
//		}
//		int f=wine[i]*year+Wine(wine,i+1,j,year+1);
//		int s=wine[j]*year+Wine(wine,i,j-1,year+1);
//		return Math.max(f, s);
//	}
//	public static int maximum_profit(int []wine)
//	{
//		int year=wine.length;
//		int [][]dp=new int[wine.length][wine.length];
//		for(int i=0;i<dp.length;i++)
//		{
//			dp[i][i]=wine[i]*year;
//		}
//		year--;
//		for(int slide=1;slide<dp.length;slide++)
//		{
//			for(int j=slide;j<dp.length;j++)
//			{
//				int i=j-slide;
//				int f=wine[i]*year+dp[i+1][j];
//				int l=wine[j]*year+dp[i][j-1];
//				dp[i][j]=Math.max(f,l);
//			}
//			year--;
//		}
//		return dp[0][dp.length-1];
//	}
}
