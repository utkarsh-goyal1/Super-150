package lec13;
import java.util.*;
public class Good_string {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		int maxc=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				c++;
				if(maxc<c) {
					maxc=c;
				}
			}
			else {
				c=0;
			}
		}
		System.out.println(maxc);
	}
}