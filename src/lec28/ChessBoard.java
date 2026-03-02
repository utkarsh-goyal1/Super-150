package lec28;
import java.util.*;
public class ChessBoard {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int c=printPath(n-1,n-1,0,0,"");
		System.out.println();
		System.out.println(c);
		
	}
	public static int printPath(int er,int ec,int cr,int cc,String ans)
	{
		if(cr==er && cc==ec)
		{
			System.out.print(ans+"{"+cr+"-"+cc+"} ");
			return 1;
		}
		if(cr>er || cc>ec)
		{
			return 0;
		}
		int count=0;
		//Knight
		count+= printPath(er,ec,cr+2,cc+1,ans+"{"+cr+"-"+cc+"}K");
		count+=printPath(er,ec,cr+1,cc+2,ans+"{"+cr+"-"+cc+"}K");
		//rook
		if(cr==0 || cc==0 || cc==ec || cr==er)
		{
			
			for(int i=1;i<=ec;i++)
			{
				count+=printPath(er,ec,cr,cc+i,ans+"{"+cr+"-"+cc+"}R");
			}
            for(int i=1;i<=er;i++)
			{
				count+=printPath(er,ec,cr+i,cc,ans+"{"+cr+"-"+cc+"}R");
			}
		}
		//Bishop
		if(cr==cc || cr+cc==ec)
		{
			for(int i=1;i<=er;i++)
			{
				count+=printPath(er,ec,cr+i,cc+i,ans+"{"+cr+"-"+cc+"}B");
			}
		}
		return count;
	}
}
