package lec7;
import java.util.*;
public class DNF_sort {
	public static void main(String []args)
	{
		int []A= {1,2,2,1,1,2};
		DnfSort(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static void DnfSort(int []A)
	{
		int low=0;
		int mid=0;
		int high=A.length-1;
		while(mid<=high)
		{
			if(A[mid]==0)
			{
				int temp=A[mid];
				A[mid]=A[low];
				A[low]=temp;
				low++;
				mid++;
			}
			else if(A[mid]==1)
			{
				mid++;
			}
			else if(A[mid]==2)
			{
				int temp2=A[mid];
				A[mid]=A[high];
				A[high]=temp2;
				high--;
			}
		}
	}
}
