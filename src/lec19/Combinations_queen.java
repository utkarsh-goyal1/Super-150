package lec19;
import java.util.*;
public class Combinations_queen  {
	public static void main(String []args)
	{
		int n=4;
		int tq=2;
		boolean []board=new boolean[4];
		Combinations(board,tq,0,"",0);
	}
	public static void Combinations(boolean []board,int tq,int qpsf,String ans,int last)
	{
		if(qpsf==tq)
		{
			System.out.println(ans+" ");
			return ;
		}
		for(int i=last;i<board.length;i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				Combinations(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				board[i]=false;//backtracking.
			}
		}
	}
}
