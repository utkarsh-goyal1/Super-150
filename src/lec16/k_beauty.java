package lec16;
import java.util.*;
public class k_beauty {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        int c=divisorSubstrings(num,k);
        System.out.println(c);
	}
	public static int divisorSubstrings(int num, int k) {
        String a=Integer.toString(num);
        int ans=0;
        String snew="";
        int si=0;
        int ei=k-1;
        while(ei<a.length())
        {
        	snew=a.substring(si,ei+1);
        	if(Integer.parseInt(snew)!=0)
        	{
        		if(num%Integer.parseInt(snew)==0)
        		{
        			ans++;
        		}
        	}
        	ei++;
        	si++;
        }
//        int j=1;
//        snew=a.substring(0,k);
//        System.out.println(snew);
//        while(j<a.length())
//        {
//        	if(Integer.parseInt(snew)!=0)
//        	{
//        		if(num%Integer.parseInt(snew)==0)
//        		{
//        			ans+=1;
//        		}
//        	}
//        	snew=a.substring(j,k+1);
//        	System.out.print(snew+" ");
//        	j++;
//        }

        return ans;
    }
}
