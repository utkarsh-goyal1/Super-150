 package lec17;
import java.util.*;
public class Power_ab {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(power(a,b,1));
	}
	public static int power(int a,int b,int ans)
	{
//		if(b==1)
//		{
//			return a;//head
//		}
//		return (a*power(a,b-1));
		if(b==0) 						//tail
		{
			return ans;
		}
		return power(a,b-1,ans*a);
	}
}
