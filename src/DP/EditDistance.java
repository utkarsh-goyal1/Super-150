package DP;
import java.util.*;
public class EditDistance {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int [][]memo=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<memo.length;i++)
		{
			Arrays.fill(memo[i],-1);
		}
		System.out.print(EditDist(s1,s1.length(),s2,s2.length(),memo));
	}
	public static int EditDist(String s1,int n,String s2,int m,int [][]memo)
     {
         if(n==0)
         {
             return m;
         }
         if(m==0)
         {
             return n;
         }
         if(memo[n][m]!=-1)
         {
             return memo[n][m];
         }
         if(s1.charAt(n-1)==s2.charAt(m-1))
         {
             return memo[n][m]=EditDist(s1,n-1,s2,m-1,memo);
         }
         else
         {
             int i=EditDist(s1,n,s2,m-1,memo);
             int d=EditDist(s1,n-1,s2,m,memo);
             int r=EditDist(s1,n-1,s2,m-1,memo);
             return memo[n][m]=Math.min(i,(Math.min(d,r)))+1;
         }
     }
//	public static int EditDist(String s1,int m,String s2,int n)
//	{
//		if(m==0)
//		{
//			return n;
//		}
//		if(n==0)
//		{
//			return m;
//		}
//		if(s1.charAt(m-1)==s2.charAt(n-1))
//		{
//			return EditDist(s1,m-1,s2,n-1);
//		}
//		else
//		{
//			int i=EditDist(s1,m,s2,n-1);
//			int r=EditDist(s1,m-1,s2,n-1);
//			int d=EditDist(s1,m-1,s2,n);
//			return Math.min(i, Math.min(r, d))+1;
//		}
//	}
}
