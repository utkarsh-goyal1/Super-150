package lec11;
import java.util.Scanner;
public class Next_permutation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		permutation(A);
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static void permutation(int[]A)
	{
		int p=-1,q=-1;
		for(int i=A.length-2;i>=0;i--)//search non increasing element.
		{
			if(A[i]<A[i+1])
			{
				p=i;
				break;
			}
		}
		if(p==-1)
		{
			reverse(A,0,A.length-1);
			return;
		}
		for(int j=A.length-1;j>p;j--)
		{
			if(A[j]>A[p])
			{
				q=j;
				break;
			}
		}
		int temp=A[p];
		A[p]=A[q];
		A[q]=temp;
		reverse(A,p+1,A.length-1);
	}
	public static void reverse(int [] A,int start,int end)
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
}