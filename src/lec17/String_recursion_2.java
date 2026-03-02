//rolling dice question.
package lec17;
import java.util.*;
public class String_recursion_2 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPath(0,n,"");
	}
	public static void printPath(int src,int des,String ans)
	{
		if(src == des)
		{
			System.out.print(ans+" ");
			return;
		}
		if(src>des)
		{
			return;
		}
		for(int dice=1;dice<=6;dice++)
		{
			printPath(src+dice,des,ans+dice);
		}
	}
}
//Count no. of ways of dice.
//package lec17;
//import java.util.*;
//public class String_recursion_2 {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println(printPath(0,n,""));
//	}
//	static int count=0;
//	public static int printPath(int src,int des,String ans)
//	{
//		if(src == des)
//		{
//			count ++; 
//		}
//		if(src>des)
//		{
//			return 0;
//		}
//		for(int dice=1;dice<=3;dice++)
//		{
//			printPath(src+dice,des,ans+dice);
//			
//		}
//		return count;
//	}
//}