//The first line consists of an integer T, the number of test cases. For each test case the first line consists of an integer N, the number of activities. 
//Then the next N lines contains two integers m and n, the start and end time of each activity.
//For each test case find the maximum number of activities that you can do.
package lec31;
import java.util.*;
public class BusyMan {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int test=0;test<t;test++)
		{
			int n=sc.nextInt();
			Pair[]arr=new Pair[n];
			for(int j=0;j<n;j++)
			{
				int start=sc.nextInt();
				int end=sc.nextInt();
				arr[j]=new Pair(start,end);
			}
			Arrays.sort(arr,new Comparator<Pair>() {
				@Override
				public int compare(Pair o1,Pair o2)
				{
					return o1.end-o2.end;
				}
			});
			int activity=1;
			int end=arr[0].end;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i].start>=end)
				{
					activity++;
					end=arr[i].end;
				}
			}
			System.out.println(activity);
		}
	}
	static class Pair{//here we use a static keyword because in the main method we are trying to make a object of inner class in the static method.
		int start;
		int end;
		public Pair(int start,int end)
		{
			this.start=start;
			this.end=end;
		}
	}
}
