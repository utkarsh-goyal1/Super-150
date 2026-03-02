package lec20;
import java.util.*;
public class Queens_in_2d_box {
	public static void main(String []args)
	{
		int m=3;
		int n=3;
		int tq=2;
		String ans="";
		int qpsf=0;
		boolean [][]A=new boolean[m][n];
		print(m,n,tq,ans,qpsf,A);
//		print2(0,0,tq,ans,3,3);
	}
	public static void print(int m,int n,int tq,String ans,int qpsf,boolean [][]A)    //PERMUTATIONS
	{
		if(qpsf==tq)
		{
			System.out.println(ans+" ");
			return ;
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(A[i][j]==false)
				{
					A[i][j]=true;
					print(m,n,tq,ans+"b{"+i+j+"}q"+qpsf,qpsf+1,A);
					A[i][j]=false;
				}
				
			}
		}
	}
//	public static void print2(int r,int c,int QTP,String path,int tots_r,int tots_c)      //COMBINATIONS
//	{
//		if(QTP==0)
//		{
//			System.out.println(path);
//			return;
//		}
//		if(c==tots_c)
//		{
//			c=0;
//			r++;
//		}
//		if(r==tots_r)
//		{
//			return ;
//		}
//		print2(r,c+1,QTP-1,path+"Q{"+r+","+c+"}",tots_r,tots_c);
//		print2(r,c+1,QTP,path,tots_r,tots_c);
//		
//	}
}
