package lec20;
import java.util.*;
public class N_Knight_Problem {
	static int count=0;
	public static void main(String []args)
	{
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        boolean [][]A=new boolean [n][n];
	        int tk=n;
	        print(A,0,0,"",tk);
	        System.out.println();
	        int c=count;
	        count=0;
	        System.out.print(c);
	}
	    public static void print(boolean [][]A,int row,int column,String ans,int tk)
	    {
	        if(tk==0)
	        {
	        	System.out.print(ans+" ");
	            count++;
	            return ;
	        }
	        if(column==A.length)
	        {
	            row++;
	            column=0;
	        }
	        if(row==A.length)
	        {
	        	return ;
	        }
            if(isSafe(A,row,column)){
              A[row][column]=true;

              print(A,row,column+1,ans+"{"+row+"-"+column+"} ",tk-1);
              A[row][column]=false;
          }
          print(A,row,column+1,ans,tk);
	        
	    }
	    public static boolean isSafe(boolean [][]A,int row,int column)
	    {
	    	int r[]={-1,-1,-2,-2};
	        int c[]={2,-2,1,-1};
	        for(int i=0;i<c.length;i++){
	            int x=row+r[i];
	            int y=column+c[i];
	            if(x>=0 && y>=0 && y<A.length && A[x][y]==true){
	                return false;
	            }
	        }
	        return true;
	    }
}
