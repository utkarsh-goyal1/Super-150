package lec26;
import java.util.*;
public class First_negative_integer_in_every_window_sizeK {
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int k=sc.nextInt();
        long []A=new long[n];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextLong();
        }
        long []res=find_ele(A,A.length,k);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
        System.out.println();
	}
	public static long[] find_ele(long A[], int N, int k)
    {
        long[] res = new long[N - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        
        // Process the first window
        for (int i = 0; i < k; i++) {
            if (A[i] < 0) {
                dq.addLast(i);
            }
        }
        // Handle the first result separately
        res[0] = dq.isEmpty() ? 0 : A[dq.getFirst()];

        // Process subsequent windows
        int c = 1;
        for (int i = k; i < N; i++) {
            // Remove elements that are outside the current window
            while (!dq.isEmpty() && dq.getFirst() <= i - k) {
                dq.removeFirst();
            }

            // Add the index of the current element if it's negative
            if (A[i] < 0) {
                dq.addLast(i);
            }

            // Update the result array
            res[c++] = dq.isEmpty() ? 0 : A[dq.getFirst()];
        }

        return res;
    }
}

//Yes, you can achieve a similar functionality using ArrayList. However, ArrayList might not be as efficient as Deque in certain operations for this specific problem
//because ArrayList does not support constant-time operations for adding or removing elements from the beginning of the list (ArrayList has O(n) time complexity 
//for these operations).
