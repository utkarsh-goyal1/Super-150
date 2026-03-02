/*package lec13;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String snew="";
		char a;
		for(int i=s.length()-1;i>=0;i--)
		{
			a=s.charAt(i);
			snew=snew+a;
		}
		if(s.equals(snew)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}*/
//package lec13;
//import java.util.Scanner;
//public class palindrome {
//	public static void main(String[]args)
//	{
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		boolean flag=false;
//		int i=0;
//		int j=s.length()-1;
//		while(i<j)
//		{
//			if(s.charAt(i)!=s.charAt(j)) {
//				flag=false;
//				break;
//			}
//			i++;
//			j--;
//			flag=true;
//		}
//		if(flag==true) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
//	}
//}
