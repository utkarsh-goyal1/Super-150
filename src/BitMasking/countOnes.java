package BitMasking;
import java.util.*;
public class countOnes {
	public static void main(String []args)
	{
		int count=0;
//		int n=67;
//		while(n>0)
//		{
//			if((n&1)!=0)
//			{
//				count++;
//			}
//			n>>=1;
//		}
//		System.out.println(count);
		
		//optimise the above code such that total iteration of loops is equal to total ones in the number.
		int n=67;
		while(n>0)
		{
			n=(n&(n-1));
			count++;
		}
		System.out.println(count);
		//take the bitwiseAnd of n with n-1.
	}
}
