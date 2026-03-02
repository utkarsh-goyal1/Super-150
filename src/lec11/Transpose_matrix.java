package lec11;
import java.util.*;
public class Transpose_matrix {
	public static void main(String []args)
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
		Transpose(A);
		display(A);
	}
	public static void Transpose(int [][]A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A[0].length;j++)
			{
				int temp=A[i][j];
				A[i][j]=A[j][i];
				A[j][i]=temp;
			}
		}
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
	
}
