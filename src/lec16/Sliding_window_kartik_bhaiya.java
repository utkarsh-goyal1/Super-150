package lec16;
import java.util.*;
public class Sliding_window_kartik_bhaiya {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();
        char ch1='a';
        char ch='b';
        int c=calculate(s,k,ch);
        int c1=calculate(s,k,ch1);
        if(c>c1)
        {
            System.out.println(c);
        }
        else{
            System.out.println(c1);
        }
	}
	public static int calculate(String s,int k,char ch)
    {
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while(ei<s.length()){
            if(s.charAt(ei)==ch)
            {
                flip++;
            }
            while(flip>k)
            {
                if(s.charAt(si)==ch)
                {
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
//Longest Repeating Character Replacement
