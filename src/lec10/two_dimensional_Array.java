/*package lec10;
import java.util.*;
public class two_dimensional_Array {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();					//row=A.length
		int [][]A=new int[n][m];			//column=A[0].length,we can use A[0] or A[1] or A[2];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		display(A);
	}
	public static void display(int [][]A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

}*/
//Web print.
package lec10;						//print zig-zag matrix (vertical up or down)
import java.util.*;
public class two_dimensional_Array {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();					//row=A.length
		int [][]A=new int[n][m];			//column=A[0].length,we can use A[0] or A[1] or A[2];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		display(A);
		display1(A);
	}
	public static void display(int [][]A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void display1(int [][]A)
	{
		for(int column=0;column<A[0].length;column++)//for column
		{
			if(column%2==0)
			{
				for(int row=0;row<A.length;row++)
				{
					System.out.print(A[row][column]+" ");
				}
			}
			else {
				for(int row=A.length-1;row>=0;row--)
				{
					System.out.print(A[row][column]+" ");
				}
			}
		}
	}

}
/*package lec10;
import java.util.*;
public class two_dimensional_Array {
	public static void main(String []args)//print zig-zag matrix(right or left)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();					
		int [][]A=new int[n][m];			
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		display(A);
		display1(A);
	}
	public static void display(int [][]A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void display1(int [][]A)
	{
		for(int row=0;row<A.length;row++)
		{
			if(row%2==0)
			{
				for (int i=0;i<A[0].length;i++)
				{
					System.out.print(A[row][i]+" ");
				}
			}
			else
			{
				for (int j=A[0].length-1;j>=0;j--)
				{
					System.out.print(A[row][j]+" ");
				}
			}
		}
	}
}*/

