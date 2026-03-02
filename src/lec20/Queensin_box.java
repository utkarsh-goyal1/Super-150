package lec20;
import java.util.*;
public class Queensin_box {
	public static void main(String []args)
	{
		int n=4;
		int q=2;
		print(n,q,"",0,0);
	}
	public static void print(int n,int q,String ans,int last,int qpsf)
	{
		if(last>n)
		{
			return ;
		}
		if(qpsf==q)
		{
			System.out.print(ans+" ");
			return ;
		}	
		print(n,q,ans+"b"+last+"q"+qpsf,last+1,qpsf+1);
		print(n,q,ans,last+1,qpsf);
	}
}
