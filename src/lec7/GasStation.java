 v//package lec7;
//
//import java.util.Scanner;
//
//public class GasStation {
//	public static void main(String args[])
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int []gas=new int[n];
//		int []cost=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			gas[i]=sc.nextInt();
//			
//		}
//		for(int i=0;i<n;i++)
//		{
//			cost[i]=sc.nextInt();
//			
//		}
//		int c=CompleteCircuit(gas,cost);
//		System.out.println(c);
//	}
//	public static int CompleteCircuit(int[] gas,int[]cost )
//	{
//		int tc=0;
//        int curr=0;
//        int si=0;
//        for(int i=0;i<gas.length;i++)
//        {
//            tc=tc+gas[i]-cost[i];
//            curr+=gas[i]-cost[i];//we have to find commulative sum;
//            if(curr<0)
//            {
//                curr=0;
//                si=i+1;
//            }
//        }
//        if(tc<0)
//        {
//            return -1;
//        }
//        return si;
//	}
//}
