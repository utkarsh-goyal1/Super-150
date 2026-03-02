//package lec20;
//import java.util.*;
//using boolean array
//public class N_Queens {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		boolean [][]A=new boolean [n][n];
//		print(A,0,n);
//	}
//	public static void print(boolean [][]A,int row,int tq)
//	{
//		if(tq==0)
//		{
//			display(A);
//			return ;
//		}
//		if(row==A.length)
//		{
//			return;
//		}
//		for(int i=0;i<A.length;i++)
//		{
//			if(isSafe(A,row,i)==true)
//			{
//				A[row][i]=true;
//				print(A,row+1,tq-1);
//				A[row][i]=false;
//				
//			}
//		}
//	}
//	public static boolean isSafe(boolean [][]A,int row,int column)
//	{
//		int r=row;
//		int c=column;
//		while(r>=0)
//		{
//			if(A[r][c]==true)
//			{
//				return false;
//			}
//			r--;
//		}
//		r=row;
//		c=column;
//		while(r>=0 && c>=0)
//		{
//			if(A[r][c]==true)
//			{
//				return false;
//			}
//			r--;
//			c--;
//		}
//		r=row;
//		c=column;
//		while(r>=0 && c<A.length)
//		{
//			if(A[r][c]==true)
//			{
//				return false;
//			}
//			r--;
//			c++;
//		}
//		return true;
//	}
//	public static void display(boolean [][]A)
//	{
//		for(int i=0;i<A.length;i++)
//		{
//			for(int j=0;j<A[0].length;j++)
//			{
//				System.out.print(A[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("-----------------------------------");
//	}
//}
//-------------------------------------------------------------------------------------------------------------------------------------------
//Using character array.
//package lec20;
//import java.util.*;
//public class N_Queens {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		char [][]A=new char [n][n];
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				A[i][j]='.';
//			}
//		}
//		print(A,0,n);
//	}
//	public static void print(char [][]A,int row,int tq)
//	{
//		if(tq==0)
//		{
//			display(A);
//			return ;
//		}
//		if(row==A.length)
//		{
//			return;
//		}
//		for(int i=0;i<A.length;i++)
//		{
//			if(isSafe(A,row,i)==true)
//			{
//				A[row][i]='Q';
//				print(A,row+1,tq-1);
//				A[row][i]='.';
//				
//			}
//		}
//	}
//	public static boolean isSafe(char [][]A,int row,int column)
//	{
//		int r=row;
//		int c=column;
//		while(r>=0)
//		{
//			if(A[r][c]=='Q')
//			{
//				return false;
//			}
//			r--;
//		}
//		r=row;
//		c=column;
//		while(r>=0 && c>=0)
//		{
//			if(A[r][c]=='Q')
//			{
//				return false;
//			}
//			r--;
//			c--;
//		}
//		r=row;
//		c=column;
//		while(r>=0 && c<A.length)
//		{
//			if(A[r][c]=='Q')
//			{
//				return false;
//			}
//			r--;
//			c++;
//		}
//		return true;
//	}
//	public static void display(char [][]A)
//	{
//		for(int i=0;i<A.length;i++)
//		{
//			for(int j=0;j<A[0].length;j++)
//			{
//				System.out.print(A[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("-----------------------------------");
//	}
//}
//
