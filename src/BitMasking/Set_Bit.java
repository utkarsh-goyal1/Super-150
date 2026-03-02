package BitMasking;
import java.util.*;
public class Set_Bit {
	public static void main(String []args)
	{
		int n=67;
		int pos=3;
		int mask=(1<<pos); //1 is left shift by pos.
		if((n&mask)==0)
		{
			System.out.println("Set nhi hai");
		}
		else
		{
			System.out.println("Set hai");
		}
	}
}
