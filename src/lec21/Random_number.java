package lec21;
import java.util.*;
public class Random_number {
	public static void main(String []args)
	{
		int si=10;
		int ei=50;
		random_number(si,ei);
	}
	public static void random_number(int si,int ei)
	{
		Random rand=new Random();
		int lo=si;
		int hi=ei;
		for(int i=0;i<10;i++)
		{
			int ri=rand.nextInt(hi-lo+1)+lo;
			System.out.println(ri+" ");
		}
	}

}
