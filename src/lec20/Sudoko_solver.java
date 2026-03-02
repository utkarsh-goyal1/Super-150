package lec20;
import java.util.*;
public class Sudoko_solver {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]A=new int[9][9];
		for(int  i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		sudoko_solver(A,0,0);
	}
	public static void sudoko_solver(int [][]A,int row,int column)
	{
		if(column==9)
		{
			row++;
			column=0;
		}
		if(row==9)
		{
			Display(A);
			return ;
		}
		if(A[row][column]!=0)
		{
			sudoko_solver(A,row,column+1);
		}
		else
		{
			for(int val=1;val<=9;val++)
			{
				if(isSafe(A,row,column,val)==true)
				{
					A[row][column]=val;
					sudoko_solver(A,row,column+1);
					A[row][column]=0;
				}
			}
		}
	}
	public static boolean isSafe(int [][]A,int row,int column,int value)
	{
		int r=0;
		int c=0;
		while(r<9)
		{
			if(A[r][column]==value)
			{
				return false;
			}
			r++;
		}
		while(c<9)
		{
			if(A[row][c]==value)
			{
				return false;
			}
			c++;
		}
		r=row-row%3;
		c=column-column%3;
		for(int i=r;i<r+3;i++)
		{
			for(int j=c;j<c+3;j++)
			{
				if(A[i][j]==value)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void Display(int [][]A)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(A[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
