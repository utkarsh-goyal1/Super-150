/*package lec8;
import java .util.*;
public class First_bad_version {
	public static void main(String []args)
	{
		int n=5;
		int bad=4;
		int c=firstBadVersion(n);
		System.out.print(c);
		
	}
	 public int firstBadVersion(int n) {
	        int low=1;
	        int high=n;
	        int ans=0;
	        while(low<=high)
	        {
	            int mid=low+(high-low)/2;
	            if(isBadVersion(mid)==true)
	            {
	                ans=mid;
	                high=mid-1;
	            }
	            else
	            {
	                low=mid+1;
	            }
	        }
	        return ans;
	    }
}
//here we have to find the minimum value so we move towards left and if we want to find the maximum value then we move towards right(low=mid+1)
*/