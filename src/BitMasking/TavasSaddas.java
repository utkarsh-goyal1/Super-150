package BitMasking;
import java.util.*;
public class TavasSaddas {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		System.out.println(Index(str));
	}
	public static int Index(String str)
	{
		int n =str.length();
		int x= (1<<n) - 2;//n-1 tak ke all lucky numbers
		int y=0;
		int pos=0;
		for(int i=n-1;i>=0;i--)
		{
			if(str.charAt(i)=='7')
			{
				y+=(1<<pos);
			}
			pos++;
		}
		return x+y+1;
	}
}


//You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
//
//If we sort all lucky numbers in increasing order, what's the 1-based index of n?
//
//Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his headphones back.
//
