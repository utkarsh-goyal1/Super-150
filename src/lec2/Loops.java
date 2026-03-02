/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {// pattern=1
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n)
		{//1
			int j=1;
			while(j<=star)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			row++;
			
		}
	}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {// pattern=2
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			star++;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=3
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n) {
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			star--;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=4
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			space--;
			star++;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern = 5
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			space++;
			star--;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java .util.*;
public class Loops{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//pattern=6
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			space+=2;
			star-=1;
			row+=1;
		}
	}
	
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=7
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			
			}
			System.out.println();
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=7
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n)
		{	
			int i=1;
			while(i<=star)
			{
				if(i==1 || i==n || row==1 || row==n)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				i++;
					
			}
			System.out.println();	
			row++;
		}
	}
}
	*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=9
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			space--;
			star+=2;
			System.out.println();
			row++;
		}
	}

}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=10
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=2*n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			space++;
			star-=2;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=11
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{	
				System.out.print("*   ");
				j++;
			}
			space--;
			star+=1;
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=12
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{	if(j%2==0)
				System.out.print("! ");
				else {
					System.out.print("* ");
				}
				  j++;
			}
			space--;
			star+=2;
			System.out.println();
			row++;
		
	}
}
}*/
package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=8 mirroring
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int row=1;
		int space1=0;
		int star1=1;
		int space2=n-2;
		int star2=1;
		while(row<=n)
		{
			int i=1;
			while(i<=space1)
			{
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star1)
			{
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=space2)
			{
				System.out.print("  ");
				k++;
			}
			int l=1;
			if(row!=n/2+1)
			{
				l=1;
			}
			else {
				 l=2;
			}
			while(l<=star2)
			{
				System.out.print("* ");
				l++;
			}
			if(row<=n/2)
			{
				space1++;
				space2-=2;	
			}
			else
			{
				space1--;
				space2+=2;
			}
			
			System.out.println();
			row++;
			
			
		}
    }
}
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=13
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			if(row<n) 
			{
			star++;
			}
			else 
			{
				star--;
			}
			System.out.println();
			row++;
		
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=14 mirroring
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}if(row<n) {
			space--;
			star++;}
			else {
				space++;
				star--;
			}
			System.out.println();
			row++;
	}
}
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=15
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}if (row<n) {
			space+=2;
			star-=1;}
			else {
				space-=2;
				star+=1;
			}
			System.out.println();
			row++;
		
	}
}}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=16
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=n;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}if (row<n) {
			space-=1;
			star-=1;}
			else {
				space+=1;
				star+=1;
			}
			System.out.println();
			row++;
		
	}
}}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=17
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n) {
        	
            int i=1;
            while(i<=star) {
            	System.out.print("* ");
            	i++;
            }
            int j=1;
        	
            while(j<=space)
            {	
            	System.out.print("  ");
            	j++;
            		
            }
            int k=1;
            while(k<=star)
            {
            	System.out.print("* ");
            	k++;
            }
            if (row<=n/2)
            {
            	star-=1;
            	space+=2;
            }
            else {
            	star+=1;
            	space-=2;
            }
            System.out.println();
            row++;
            
            		
        }
    }
}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=18
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n/2;
        while(row<=n) {
        	int j=1;
            while(j<=space)
            {	
            	System.out.print("  ");
            	j++;
            		
            }
            int i=1;
            while(i<=star) {
            	System.out.print("* ");
            	i++;
            }
            
            if(row<n/2+1) {
            star+=2;
            space-=1;}
            else {
            	star-=2;
            	space+=1;
            }
            System.out.println();
            row++;
        }
    }
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//19
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=-1;
		int star=n/2+1;
		while(row<=n) {
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==1||row==n)
			{
				k=2;
			}
			while(k<=star)
			{
				System.out.print("* ");
				k++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			System.out.println();
			row++;
		}
		
		
	}
}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=20
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n/2;
        int space2=-1;
        int star2=1;
        while(row<=n) {
        	int j=1;
        	
            while(j<=space)
            {	
            	System.out.print("  ");
            	j++;
            		
            }
            int i=1;
            while(i<=star) {
            	System.out.print("* ");
            	i++;
            }
            int k=1;
            while(k<=space2)
            {
            System.out.print("  ");
            k++;
            }
            if(row==1 || row==n) {
        	star2=0;	
        	}
            else {
            	star2=1;
            }
            int l=1;
            while(l<=star2)
            {
            	System.out.print("* ");
            	l++;
            }
            
            if(row<n/2+1) {
            
            space-=1;
            space2+=2;}
            else {
            
            	space+=1;
            	space2-=2;
            }
            System.out.println();
            row++;
        }
    }
}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=21
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int star2=1;
        int space=2*n-3;
        while(row<=n) {
        	
            int i=1;
            while(i<=star) {
            	System.out.print("* ");
            	i++;
            }
            int j=1;
            while(j<=space)
            {	
            	System.out.print("  ");
            	j++;
            		
            }
            int k=1;
            if(row==n) {
        		k=2;
        	}
            while(k<=star2)
            {
            	
            	System.out.print("* ");
            	k++;
            }
            star+=1;
            space-=2;
            star2+=1;
            System.out.println();
            row++;
        }
    }
}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=22
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int star2=n;
        int space=-1;
        while(row<=n) {
        	
            int i=1;
            while(i<=star) {
            	System.out.print("* ");
            	i++;
            }
            int j=1;
            while(j<=space)
            {	
            	System.out.print("  ");
            	j++;
            		
            }
            int k=1;
            if(row==1) {
            	k=2;
            }
            
            while(k<=star2)
            {
            	
            	System.out.print("* ");
            	k++;
            }
            star-=1;
            space+=2;
            star2-=1;
            System.out.println();
            row++;
        }
    }
}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pascel's triangle
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=1;
		while(row<n)
		{
			int i=0;
			int val=1;
			while(i<star) {
				System.out.print(val+"\t");
				val=((row-i)*val)/(i+1);
				i++;
			}
			System.out.println();
			star++;
			row++;
			
		}
		
		
		}
	}

*/
/*
package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=23
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int k=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print(k+" ");
				j++;
			}
			System.out.println();
			row++;
			space-=1;
			star+=2;
		
	}
}}*/

/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=24
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print(row+" ");
				j++;
			}
			System.out.println();
			row++;
			space-=1;
			star+=2;
		
	}
}}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {//pattern=25
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int k=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				if(k>9)
				{
					System.out.print(k+" ");
				}
				else {
					System.out.print(k+"  ");	
				}
				j++;
				k++;
			}
			System.out.println();
			row++;
			space-=1;
			star+=2;
		
	}
}}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {pattern=26
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}							
			int j=1;
			while(j<=star)
			{
				System.out.print(j+" ");
				j++;
			}
			space--;
			star+=2;
			System.out.println();
			row++;
		}
	}

}*/
/*package lec2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {pattern=27
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}										
			int j=1;
			int val=1;
			while(j<=star)
			{
				System.out.print(val+" ");
				if (j<=star/2) {
				val++;
				}
				else {
				val--;	
				}
				j++;
				
			}
			space--;
			star+=2;
			System.out.println();
			row++;
		}
	}

}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=28
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        int temp=n;
        while(row<=n) {
        	int val=row;
            int i=1;
            while(i<=space) {
            	System.out.print("  ");
            	i++;
            }
            int j=1;
            while(j<=star)
            {
            	if(j<=star/2) {
                System.out.print(val+" ");
                val++;}
            	else {
            		System.out.print(val+" ");
            		val--;
            	}
            	j++;
            }
            
            star+=2;
           
            space--;
            System.out.println();
            row++;
        }
    }
}*/

/*package lec3;
import java.util.*;
public class Pattern_mirror {
	public static void main(String args[]) {//pattern=29
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}										
			int j=1;
			while(j<=star)
			{
				if(j==1 || j==star) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("0 ");
				}
				j++;
				
			}
			val++;
			space--;
			star+=2;
			System.out.println();
			row++;
		}
	}

}*/
/*package lec2;
import java .util.Scanner;
public class Loops{
    public static void main(String[] args) {//pattern=30
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        while(row<=n) {
            int j=1;
            int val=n;
            while(j<=star)
            {
                System.out.print(val+" ");
                j++;
                val--;
                
            }
            System.out.println();
            row++;
        }
    }
}*/

/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=31
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int temp=n;
        while(row<=n) {
            int j=1;
            int val=n;
            while(j<=star)
            {
            	if(j==temp)
            	{
            		System.out.print("* ");
            	}
            	else {
                System.out.print(val+" ");
                }
            	j++;
                val--;
            
            }
            temp--;
            System.out.println();
            row++;
        }
    }
}
*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=32
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int temp=n;
        int val=1;
        while(row<=2*n-1) {
            int j=1;
            while(j<=star)
            {
            	if(j%2==0)
            	{
            		System.out.print("* ");
            	}
            	else {
                System.out.print(val+" ");
                }
            	j++;
            
            }
            if(row<n) {
            star+=2;
            val++;}
            else {
            	star-=2;
            	val--;
            }
            System.out.println();
            row++;
        }
    }
}*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//pattern=33
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        int val=0;
        while(row<=n) {
        	
            int i=1;
            while(i<=space) {
            	System.out.print("  ");
            	i++;
            }
            int j=1;
            while(j<=star)
            {
            	if(j==star/2+1)
            	{
            		System.out.print(0+" ");
            		val=9;
            	}
            	else if(j<=star/2) {
            	System.out.print(val+" ");
            	val++;
            	}
            	else {
            		System.out.print(val+" ");
            		val--;
            	}
            	j++;
            }
            val=n-row;
            star+=2;
            space--;
            System.out.println();
            row++;
        }
    }
}

*/
/*package lec2;
import java .util.Scanner;
public class Loops {
    public static void main(String[] args) {//double sided arrow pattern
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        int star2=1;
        int space2=-1;
        int temp=n/2;
        while(row<=n)
        {
            int val=row;
            if(row<=n/2+1)
            {
                val=row;
            }
            else{
                val=temp;
                temp--;
            }
            
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print(val+" ");
                j++;
                val--;
            }
            int k=1;
            while(k<=space2)
            {
                System.out.print("  ");
                k++;
            }
            if(row!=1 && row!=n)
            {
                    int l=1;
                    val=1;
            while(l<=star2)
            {
                System.out.print(val+" ");
                l++;
                val++;
            }
            }
            
            if(row<=n/2)
            {
                star++;
                star2++;
            space-=2;
            space2+=2;
            }
            else{
                star2--;
                star--;;
            space+=2;
            space2-=2;
            }
            
            System.out.println();
            row++;
        }

    }
}*/

