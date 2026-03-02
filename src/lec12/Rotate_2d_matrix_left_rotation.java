package lec12;

import java.util.Scanner;

public class Rotate_2d_matrix_left_rotation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] A=new int[n][n];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		rotate(A);
		Tranpose(A);
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Tranpose(int[][] A)
	{
		for (int i = 0; i < A.length; i++) 
		{
			for (int j = i + 1; j < A.length; j++) 
			{
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
	}
	public static void rotate(int[][]A)
	{
		for(int i=0;i<A.length;i++)
		{
			reverse(A[i]);
		}
	}
	public static void reverse(int[] A)
	{
		int i = 0;
		int j = A.length - 1;
		while (i < j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
	}
	
}
