/*package lec6;
import java.util.Scanner;
public class ArraysQ {
		public static void main(String args[])//Linear Searching.
		{
			Scanner sc=new Scanner(System.in);
			int c;
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			int ele=sc.nextInt();
			System.out.print(search(A,ele));
		}
		public static int search(int [] A,int ele)
		{
			for(int i=0;i<A.length;i++)
			{
				if (A[i]==ele)
				{
					return i;
				}
			}
			return -1;		
		}
}*/
/*package lec6;
import java.util.Scanner;
public class ArraysQ {
		public static void main(String args[])//maximum element in an array
		{
			Scanner sc=new Scanner(System.in);
			int c;
			int max=-10000000;
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			c=max(A,max);
			System.out.println(c);
		}
		public static int max(int [] A,int max)
		{
			for(int i=0;i<A.length;i++)
			{
				if(A[i]>max)
				{
					max=A[i];
				}
			}
			return max;
			
		}
		
}*/
/*package lec6;//two pointer approach algorithm
import java.util.Scanner;
public class ArraysQ {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			reverse(A);
		}
		public  static void reverse(int [] A)
		{
			int i=0;
			int j=A.length-1;
			while(i<=(A.length)/2)
			{
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				i++;
				j--;
			}
			for(int k=0;k<A.length;k++)
			{
				System.out.print(A[k]+" ");
			}
		}
}*/
/*package lec6;
import java.util.Scanner;//range_reverse
public class ArraysQ {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			int start=sc.nextInt();
			int end=sc.nextInt();
			reverse(A,start,end);
		}
		public  static void reverse(int [] A,int start,int end)
		{
			int i=start-1;
			int j=end-1;
			while(i<j)
			{
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				i++;
				j--;
			}
			for(int k=0;k<A.length;k++)
			{
				System.out.print(A[k]+" ");
			}
		}
		
		
}*/
	
/*package lec6;
import java.util.Scanner;//right circular rotation
public class ArraysQ {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			int step=sc.nextInt();
			step=step%n;
			reverse_range(A,n-step,n-1);//rotate the part of array equal to no. of rotations from right side.
			reverse_range(A,0,n-step-1);//rotate the remaining part of the array
			reverse_range(A,0,n-1);//rotate the entire array.
			for(int i=0;i<n;i++)
			{
				System.out.print(A[i]+" ");
			}
	        
		}
		public  static void reverse_range(int [] A,int start,int end)
		{
			int i=start;
			int j=end;
			while(i<j)
			{
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				i++;
				j--;
			}
			
		}
}*/
/*package lec6;
import java.util.Scanner;//left circular rotation
public class ArraysQ {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] A=new int [n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			int step=sc.nextInt();
			step=step%n;
			reverse_range(A,0,step-1);//rotate the part of array equal to no. of rotations from left side.
			reverse_range(A,step,n-1);//rotate the remaining part of the array
			reverse_range(A,0,n-1);//rotate the entire array.
			for(int i=0;i<n;i++)
			{
				System.out.print(A[i]+" ");
			}
	        
		}
		public  static void reverse_range(int [] A,int start,int end)
		{
			int i=start;
			int j=end;
			while(i<j)
			{
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				i++;
				j--;
			}
			
		}
}*/



