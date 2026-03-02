package lec17;
import java.util.*;
public class Recursion_2 {
	public static void main(String []args)//reverse string 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		reverse(str);
	}
	public static void reverse(String str)
	{
		if(str==null || str.length()<=1) {
			System.out.print(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));//nth character print is the self work and reverse n-1 string is our small problem that is solved by the recursion.
			reverse(str.substring(0,str.length()-1));
		}
	}
}
