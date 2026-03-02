/*package lec4;
import java.util.*;
public class Functions {
 int val=110;
	public static void main(String args[])
			{
		
				Scanner sc=new Scanner(System.in);
				int a=5;
				int b=6;
				addition(a,b);
				System.out.println(val);
			}
	public static void addition(int a, int b)
	{
		int c=a+b;
		int val=90;
		val=val+5;//access of a global variable by using class.global variable.
	
	}
}*/
package lec4;
import java.util.*;
public class Functions {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//boston numbers
		int n=sc.nextInt();
		int i=2;
		int temp=sum(n);
		int prime_sum=0;
		while(i<=n)
		{
			while(n%i==0)
			{
				prime_sum=prime_sum + sum(i);
				n=n/i;
			}
			i++;
		}
		if(temp==prime_sum)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		
	}
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
}