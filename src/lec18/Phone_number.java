package lec18;
import java.util.*;
public class Phone_number 
{
	static String []key={"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz" };
	public static void main(String []args)
	{
		printkeypad("129","");
	}
	public static void printkeypad(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return ;
		}
		char ch=ques.charAt(0);
		String press=key[ch-'0'];
		for(int i=0;i<press.length();i++)
		{
			printkeypad(ques.substring(1),ans+press.charAt(i));
		}
	}
}