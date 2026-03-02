/*package lec7;
import java.util.*;
public class max_sum_subarray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int c=subarray(A);
		System.out.print(c);

	}
public static int subarray(int []A)
{
	int ans=Integer.MIN_VALUE;
	
	for(int i=0;i<A.length;i++)
	{	int sum=0;
		for(int j=i;j<A.length;j++)
		{
			 sum=sum+A[j];
			 ans=Math.max(sum,ans);
		}
	}
	return ans;
}
}*/
//Kedan's algorithm.
/*package lec7;
import java.util.*;
public class max_sum_subarray {
	public static void main(String args[])//kedan's algorithm.
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int c=subarray(A);
		System.out.print(c);

	}
public static int subarray(int []A)
{
	int max_sum=Integer.MIN_VALUE;
	int current_sum=0;
	for(int i=0;i<A.length;i++)
	{
		current_sum=current_sum+A[i];
		if(current_sum>max_sum)
		{
			max_sum=current_sum;
		}
		if(current_sum<0)
		{
			current_sum=0;
		}
		
		
	}
	return max_sum;
}
}
*/
/*package lec7;
import java.util.*;//CALCULATE THE SUM
public class max_sum_subarray {
	public static void main(String args[])//kedan's algorithm.
	{
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int[]A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int l=0;
        int []B=new int[n];
        while(n>0)
        {
        	B[l]=A[l];
        	n--;
        	l++;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            sum=0;
            for(int j=0;j<A.length;j++)
            {
                int temp=j-x;
                if(temp<0)
                {
                    temp=A.length-x;
                }
                B[j]=A[j]+A[temp];
                
          }
           for(int k=0;k<A.length;k++)
           {
        	   A[k]=B[k];
        	   sum=sum+B[k];
           }
           
        }
        System.out.print(sum%(int)(Math.pow(10,9)+7));
}
}*/