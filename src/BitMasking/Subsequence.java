package BitMasking;
import java.util.*;
public class Subsequence {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		print(str);
	}
	public static void print(String s)
	{
		int n =s.length();
		int pSize=1<<n;
		for(int i=0;i<pSize;i++)//psize is equal to the size of power set.
		{
			for(int j=0;j<n;j++)//here we are checking for each bit in i , if it is set or not.
			{
				if((i&(1<<j))!=0)
				{
					System.out.print(s.charAt(j)+"");
				}
			}
			System.out.println();
		}
	}
}
