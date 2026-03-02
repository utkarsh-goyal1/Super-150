package lec21;
import java.util.*;
public class Power_ab {
	public static void main(String []args)
	{
		int a=2;
		int b=8;
		System.out.print(power(a,b));
	}
	public static int power(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		int ans=power(a,b/2);
		ans=ans*ans;
		if(b%2!=0)
		{
			ans=ans*a;
		}
		return ans;
	}
}
