package lec32;
import java.util.*;
public class Merge_ropes {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []A=new int [n];
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
			pq.add(A[i]);
		}
		int sum=0;
		while(pq.size()>1)
		{
			int a=pq.poll();
			int b=pq.poll();
			sum=sum+a+b;
			pq.add(a+b);
		}
		System.out.println(sum);
	}
}
