package lec15;
import java.util.*;
public class Reverse_words_in_string {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.trim();
		String []arrOfstring=s.split("\s+");//split on whitespace.
		reverse(arrOfstring,0,arrOfstring.length-1);
		String snew="";
		for(int i=0;i<arrOfstring.length;i++)
		{
			snew=snew+arrOfstring[i]+" ";
		}
		System.out.println(snew);
		
	}
	public static void reverse(String []A,int i,int j)
	{
		while(i<j)
		{
			String temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			i++;
			j--;
		}
	}
}
