//Palindrome Partioning.
package lec20;
import java.util.*;
public class Prtitions_strings {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<String>ll=new ArrayList<>();
		List<List<String>>res=new ArrayList<>();
		print(s,ll,res);
		System.out.println(res);
	}
	public static void print(String ques,List<String>ll,List<List<String>>res)
	{
		if(ques.length()==0)
		{
			res.add(new ArrayList<>(ll));
			return;
		}
		for(int i=1;i<=ques.length();i++)
		{
			String part=ques.substring(0,i);
			if(isPalindrome(part)) {
				ll.add(part);
				print(ques.substring(i),ll,res);//Lists are formed in heap so we have to backtrack here because recursion will not change the content of previous answer list.
				ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
