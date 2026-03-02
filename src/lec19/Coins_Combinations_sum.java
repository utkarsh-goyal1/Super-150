////permutations.
//package lec19;
//import java.util.*;
//public class Coins_Combinations_sum {
//	public static void main(String []args)
//	{
//		int []coin= {2,3,5};
//		int target=10;
//		String ans="";
//		print(coin,ans,target);
//	}
//	public static void print(int []coin,String ans,int target)
//	{
//		if(target==0)
//		{
//			System.out.print(ans+" ");
//			return ;
//		}
//		for(int i=0;i<coin.length;i++)
//		{
//			if(target>=coin[i])
//			{
//				print(coin,ans+coin[i],target-coin[i]);
//			}
//		}
//	}
//}
//Combinations                                                                                                                      
package lec19;
import java.util.*;
public class Coins_Combinations_sum {
	public static void main(String []args)
	{
		int []coin= {2,5,2,1,2};
		int target=5;
		String ans="";
		int last=0;
		print(coin,ans,target,0);
		System.out.println();
	}
	public static void print(int []coin,String ans,int target,int last)
	{
		if(target==0)
		{
			System.out.print(ans+" ");
			return ;
		}
		for(int i=last;i<coin.length;i++)
		{
			if(target>=coin[i])
			{
				print(coin,ans+coin[i],target-coin[i],i+1);//here we put i because we have infinite supply.otherwise we will use i+1.
			}
		}
	}
}