//find a number x such that x xor A is the minimum and the count of set bits in x and b are equal.
package BitMasking;
import java.util.*;
public class MinimumXor {
	public static void main(String []args)
	{
		int a=11;
		int b=125;
		System.out.println(Min_val(a,b));
	}
	public static int Min_val(int a,int b)
	{
		int c=countSetBit(b);
		int x=0;
		for(int i=31;i>=0 && c>0;i--)
		{
			if((a & (1<<i))!=0)
			{
				x+=(1<<i);
				c--;
			}
		}
		for(int i=0;i<=31 && c>0 ;i++)
		{
			if((a & (1<<i))==0)
			{
				x+=(1<<i);
				c--;
			}
		}
		return x;
	}
	public static int countSetBit(int num)
	{
		int count=0;
		while(num>0)
		{
			num=(num & (num-1));
			count++;
		}
		return count;
	}
}

//In this question, we need to find a integer whose xor with a is minimum and count of set bits is equal to b .
//So to make the xor of a integer with 'a' minimum , we have to make the set bits in a integer equal to the 'a'.Because xor is odd detector. So when our integer will contains
//same set bit then on taking xor they will get zero.
//In the end we will check if my integer has less set bits than b then set the bits from start to make the  number minimum.
