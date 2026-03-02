//package lec6;
//import java.util.*;
//public class Tapping_rainwater {
//	public static void main(String args[])
//	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int [] A=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			A[i]=sc.nextInt();
//		}
//		int res=rain(A);
//		System.out.println(res);
//	}
//	public static int rain(int [] height)
//    {
//        int res=0;
//        int n=height.length;
//        int [] left=new int[n];
//        left[0]=height[0];
//        for(int i=1;i<n;i++)
//        {
//            left[i]=Math.max(left[i-1],height[i]);
//        }
//        int [] right=new int[n];
//        right[n-1]=height[n-1];
//        for(int i=n-2;i>=0;i--)
//        {
//            right[i]=Math.max(right[i+1],height[i]);
//        }
//        for(int i=0;i<n;i++)
//        {
//          res=res+Math.min(left[i],right[i])-height[i];
//        }
//        return res;
//    }
//}
