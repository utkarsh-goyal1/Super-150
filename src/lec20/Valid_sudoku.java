package lec20;
import java.util.*;
public class Valid_sudoku {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char [][]A= new char[9][9];
		isValid(A,0,0);
        boolean res=ans;
        ans=false;
        System.out.println(res);
	}
	static boolean ans=false;
    public static void isValid(char [][]A,int cr,int cc)
	{
		if(cc==9)
		{
			cr++;
			cc=0;
		}
		if(cr==9)
		{
			ans=true;
            return ;
		}
		if(A[cr][cc]=='.')
		{
			isValid(A,cr,cc+1);
		}
		else
		{
			if(isSafe(A,cr,cc,A[cr][cc])==true)
			{
				isValid(A,cr,cc+1);
			}
		}
	
	}
	public static boolean isSafe(char [][]A,int row,int column,char value)
	{
		int r=0;
		int c=0;
		while(r<9)
		{
            if(r!=row)
            {
                if(A[r][column]==value)
			    {
				    return false;
			    }
            }
			r++;
		}
		while(c<9)
		{
            if(c!=column)
            {
                if(A[row][c]==value)
			    {
				    return false;
			    }
            }
			c++;
		}
		r=row-row%3;
		c=column-column%3;
		for(int i=r;i<r+3;i++)
		{
			for(int j=c;j<c+3;j++)
			{
                if(i!=row && j!=column)
                {
                    if(A[i][j]==value)
				    {
					    return false;
				    }
                }
			}
		}
		
		return true;
	}
}
