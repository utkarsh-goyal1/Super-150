package lec26;
import java.util.*;
public class Sliding_window_maximum {
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int []ans=find_max(A,k);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] find_max(int []A,int k)
	{
		int n=A.length;
		int []max=new int[n-k+1];
		Deque<Integer>dq=new LinkedList<>();
		for(int i=0;i<k;i++)
		{
			while(!dq.isEmpty() && A[dq.getLast()]<=A[i])
			{
				dq.removeLast();
			}
			dq.add(i);//last main add karega.
		}
		max[0]=A[dq.getFirst()];//First window ka maximum.
		int j=1;
		for(int i=k;i<n;i++)
		{
			//window i-k tak remove
			while(!dq.isEmpty() && dq.getFirst()<=i-k)
			{
				dq.remove();//pehle element ko remove karega
			}
			while(!dq.isEmpty() && A[dq.getLast()]<=A[i])
			{
				dq.removeLast();
			}
			dq.add(i);
			max[j++]=A[dq.getFirst()];
		}
		return max;
	}
}