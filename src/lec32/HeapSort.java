package lec32;
import java.util.*;
public class HeapSort {
	public static void main(String []args)
	{
		int []A= {5,4,3,1,2};
		sort(A);
		System.out.println(Arrays.toString(A));
	}
	public static void sort(int []A)
	{
		BuildHeap(A,A.length);//Build Heap
		for(int i=A.length-1;i>=1;i--)
		{
			int temp=A[0];//remove first node and again heapify.
			A[0]=A[i];
			A[i]=temp;
			maxHeapify(A,i,0);
		}
	}
	public static void BuildHeap(int []A,int size)
	{
		for(int i=(size-2)/2;i>=0;i--)
		{
			maxHeapify(A,A.length,i);
		}
	}
	public static void maxHeapify(int []A,int size,int index)
	{
		int largest=index;
		int left=2*index+1;
		int right=2*index+2;
		if(left<size && A[left]>A[largest])
		{
			largest=left;
		}
		if(right<size && A[right]>A[largest])
		{
			largest=right;
		}
		if(largest!=index)
		{
			int temp=A[index];
			A[index]=A[largest];
			A[largest]=temp;
			maxHeapify(A,size,largest);
		}
	}
}
