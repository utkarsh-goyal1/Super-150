package BitMasking;
import java.util.*;
public class MagicNumber {
	public static void main (String []args)
	{
		int n=14;
		int mul=5;
		int sum=0;
		while(n>0)
		{
			if((n&1)!=0)
			{
				sum+=mul;
			}
			n>>=1;
			mul=mul*5;
		}
		System.out.println(sum);
	}
}

//A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. first few magic numbers are-5,25,30(5+25),125,130(125+5)...
//ex-n=2  , output-25
//ex-n=5  , output-130


//Every number is the sum of unique powers of 2.
