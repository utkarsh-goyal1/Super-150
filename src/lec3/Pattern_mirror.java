/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//hcf
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf=0;
		int smaller;
		if(a<b)
		{
			smaller=a;
		}
		else
		{
			smaller=b;
		}
		for(int i=1;i<=smaller;i++)
		{
			if(a%i==0 && b%i==0)
			{
			 hcf=i;
			}
		}
		System.out.println(hcf);
		
	}
	
}*/
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//hcf
		int a=sc.nextInt();
		int b=sc.nextInt();
		int div,rem,divi;
		div=a;
		divi=b;
		while((divi % div)!=0)
		{
			rem=divi%div;
			divi=div;
			div=rem;		
		}
		System.out.print(div);
	}
	
}*/
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//fibonacci;
		int n=sc.nextInt();
		int a=0;
		int c=0;
		int b=1;
		while(n-2>0)
		{
			c=a+b;
			
			a=b;
			b=c;
			n--;
		}
		System.out.print(c);
		
		
	}
}*/
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])//lcm
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int greater=0;
		if (a>b) {
			
			greater=a;
		}
		else {
			greater=b;
		}
		while(True)
		{
			if (greater%a==0 && greater%b==0)
			{
				System.out.println(greater);
				break;
			}
			greater++;
		}	
	}
}*/

/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])
	{
	System.out.println(Integer.MAX_VALUE);
	char ch='a';
	ch++;//ch=(char)(ch+1);here ++ denotes the implicit type conversion.
	System.out.println(ch);
	}
}*/
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])//decimal to binary.
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int b=0;
		int mul=1;
		while(n>0) {
			 rem=n%2;//destination
			b=b+rem*mul;
			mul=mul*10;//source
			n=n/2;//destination
		}
		System.out.println(b);
		
	}
}*/

/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])//10 base to 6 base
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int b=0;
		int mul=1;
		while(n>0) {
			 rem=n%6;//destination
			b=b+rem*mul;
			mul=mul*10;//source
			n=n/6;//destination
		}
		System.out.println(b);
		
	}
}*/
//above code is valid only when one of the base is 10.this code can be used to convert a number from base 10 to any base.
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])//binary to decimal.
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int b=0;
		int mul=1;
		while(n>0) {
			 rem=n%10;//destination
			b=b+rem*mul;
			mul=mul*2;//source
			n=n/10;//destination
		}
		System.out.println(b);
		
	}
}*/
/*package lec3;
import java.util.*;
public class Pattern_mirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        int row=1;
        int star=1;
        int k=1;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
            row++;
        }
		
	}
}*/

/*package lec3;
import java .util.Scanner;
public class Pattern_mirror {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        int sum=0;
        while(n>0)
        {
        	if(n%i==0)
        	{
        		sum=sum+i;
        		n=n/i;
        	}
        	else {
        		i++;
        	}
        }
        System.out.print(sum);
        
    }
}*/
//Inverse of  a number
//package lec3;
//import java .util.Scanner;
//public class Pattern_mirror {
//    public static void main(String[] args) {
//    	Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int ans=0;int pos=1;
//		while(n>0)
//		{
//		    int rem=n%10;
//		    ans=(int)(ans+pos*(Math.pow(10,rem-1)));
//		    n=n/10;
//		    pos++;
//		}
//		System.out.print(ans);
//        
//    }
//}
