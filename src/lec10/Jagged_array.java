package lec10;
import java.util.*;
public class Jagged_array {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();//n=rows
		int [][]A=new int [n][];
		for(int i=0;i<A.length;i++)
		{
			int c=sc.nextInt();//columns
			A[i]=new int[c];
			for(int j=0;j<A[i].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}
