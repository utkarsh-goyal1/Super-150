//If the array is already sorted then there will be no swapping ,but still we will continue with the passes and there will be (n-1)passes.
//If we can identify ,that the array is sorted then we should stop execution of further process.This is the optimization.
//If there is no swapping in a particular pass ,it means that the array has become sorted ,so we should not perform the further passes.
//For this we can have a flag variable which is set to true before each pass and is made false when a swapping is performed.
package lec7;
import java.util.Scanner;
public class Optimised_bubble_sort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		sorted(A);
		
	}
	public static void sorted(int []A)
	{
		boolean flag=false;
		for(int i=1;i<A.length;i++)//NO.of passes
		{
			flag=false;
			for(int j=0;j<A.length-i;j++)//no.of comparisions.
			{
				if(A[j]>A[j+1])
				{
					flag=true;
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				
			}
			if(flag==false)
			{
				break;
			}
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
