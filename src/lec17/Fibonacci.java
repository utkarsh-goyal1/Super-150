package lec17;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
	
	}
	public static int fibonacci(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		int fi=fibonacci(n-1);
		int fj=fibonacci(n-2);
		return fi+fj;
	}
}
