/*package lec11;
import java.util.*;
public class search_2d_matrix {
	public static void main(String args[])//Stair case method.
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] A=new int[m][n];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		int t=sc.nextInt();
		boolean ans=searchMatrix(A,t);
		System.out.print(ans);
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        boolean ans = false;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
                ans =  true;
                break;
            }
            else if(matrix[row][col]>target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return ans;
    }

}*/
