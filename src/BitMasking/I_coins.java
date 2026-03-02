package BitMasking;
import java.util.*;
public class I_coins {
	public static void main(String []args)
	{
		double[]c = {0.30, 0.60, 0.80 };
		int n=c.length;
		double [][]memo = new double[n][(n+4)/2];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i],-1);
		}
		System.out.println(probability_head(c,0,(n+1)/2,memo));
	}
	public static double probability_head(double []c,int i,int h,double[][]memo)
	{
		if(h==0)
		{
			return 1;
		}
		if(i==c.length)
		{
			return 0;
		}
		if(memo[i][h]!=-1)
		{
			return memo[i][h];
		}
		double ans=c[i]*probability_head(c,i+1,h-1,memo)+(1-c[i])*probability_head(c,i+1,h,memo);
		return memo[i][h]=ans;
		
	}
	
}
