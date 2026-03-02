package Trie;
import java.util.*;
import Trie.Maximum_XOR_of_Two_Numbers.Node;
public class MaximumXORWithanElementFromArray {
	public static class Node{
		Node zero;
		Node one;
	}
	public static void Insert(Node root, int val)
	{
		Node curr=root;
		for(int i=31;i>=0;i--)
		{
			int bit=val&(1<<i);
			if(bit==0)
			{
				if(curr.zero!=null)
				{
					curr=curr.zero;
				}
				else
				{
					Node nn = new Node();
					curr.zero=nn;
					curr=nn;
				}
			}
			else
			{
				if(curr.one!=null)
				{
					curr=curr.one;
				}
				else
				{
					Node nn = new Node();
					curr.one=nn;
					curr=nn;
				}
			}
		}
	}
	public static void main(String []args)
	{
		int []nums = {0,1,2,3,4};
		int [][]queries = {{3,1},{1,3},{5,6}};
		Arrays.sort(nums);
		pair []p = new pair[queries.length];
		for(int i=0;i<queries.length;i++)
		{
			p[i]=new pair(queries[i][0],queries[i][1],i);
		}
		Arrays.sort(p,new Comparator<pair>() {
			@Override
			public int compare(pair o1,pair o2)
			{
				return o1.mi-o2.mi;
			}
		});
		int []ans = new int[p.length];
		int j=0;
		Node root= new Node();
		for(pair x:p)
		{
			while(j<nums.length && nums[j]<=x.mi)
			{
				Insert(root,nums[j]);
				j++;
			}
			if(j==0)
			{
				ans[x.i]=-1;
			}
			else
			{
				ans[x.i]=getXor(root,x.xi);
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	public static int getXor(Node root,int val)
	{
		int xor=0;
		Node curr=root;
		for(int i=31;i>=0;i--)
		{
			int bit=(val &(1<<i));
			if(bit==0)
			{
				if(curr.one!=null)
				{
					xor+=(1<<i);
					curr=curr.one;
				}
				else
				{
					curr=curr.zero;
				}
			}
			else
			{
				if(curr.zero!=null)
				{
					xor+=(1<<i);
					curr=curr.zero;
				}
				else
				{
					curr=curr.one;
				}
			}
		}
		return xor;
	}
	static class pair{
		int xi;
		int mi;
		int i;
		public pair(int xi,int mi,int i)
		{
			this.xi=xi;
			this.mi=mi;
			this.i=i;
		}
	}
}
//Sorting the nums array allows us to efficiently find elements in nums that do not exceed mi,
//Sorting the queries array based on the mi values ensures that we process queries in ascending order of their upper limits. 
//This sorting helps in optimizing the insertion process into the trie (represented by the Node class) because as we move from smaller mi values to larger ones, 
//we can reuse the insertion work done for smaller values and only need to update the trie for new nums that are smaller than the current mi value.
//In the given code, the index is maintained in the pair class to keep track of the original order of the queries. 
//The index i is useful when constructing the final result array ans.
