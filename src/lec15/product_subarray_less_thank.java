package lec15;
import java.util.*;
public class product_subarray_less_thank {//variable size window
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(numSubarrayProductLessThanK(nums,k));
	}
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int si=0;//shrink~start point
        int ei=0;//add element~end point
        int p=1;
        while(ei<nums.length)
        {
            p*=nums[ei];//window size grow
            while(p>=k && si<=ei)//we use this condition otherwise window size becomes 0 ei=4,si=5-->window size=4-5+1=0.
            {
                p/=nums[si];//window size shrink
                si++;
            }
            ans=ans+(ei-si+1);//calculate answer
            ei++;

        }
        return ans;
    }
}
//for questions of variable size window-
//1.keep start and end point of window at 0,0.
//2.keep moving end point through the array and add elements to the window until the condition becomes false.
//3,as the condition becomes false,start moving starting point until the condition becomes true.
