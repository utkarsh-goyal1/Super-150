package Graph2;
import java.util.*;
public class cycleDetection  {
	HashMap<Integer,HashMap<Integer,Integer>>map =new HashMap<>();
	public cycleDetection(int v) {
		for(int i=1;i<=v;i++)
		{
			map.put(i,new HashMap<>());
		}
	}
	public void AddEdge(int v1,int v2,int cost)
	{
		map.get(v1).put(v2, 0);
	}
	public int[] inDegree() {
		int v =map.size();
		int []arr = new int[v+1];
		for(int key:map.keySet())
		{
			for(int nbrs:map.get(key).keySet()) {
				arr[nbrs]++;
			}
		}
		return arr;
	}
	public boolean isCycle() {
		int []in =inDegree();
		Queue<Integer>q =new LinkedList<>();
		for(int i=1;i<in.length;i++)
		{
			if(in[i]==0)
			{
				q.add(i);
			}
		}
		int count=0;
		while(!q.isEmpty())
		{
			int curr=q.poll();
//			System.out.println(curr);
			count++;
			for(int nbrs:map.get(curr).keySet())
			{
				in[nbrs]--;
				if(in[nbrs]==0)
				{
					q.add(nbrs);
				}
			}
		}
		return count!=map.size();
	}
	public static void main(String []args)
	{
		cycleDetection t = new cycleDetection(6);
		t.AddEdge(1, 2, 0);
		t.AddEdge(1, 3, 0);
		t.AddEdge(2, 4, 0);
		t.AddEdge(3, 4, 0);
		t.AddEdge(4, 5, 0);
		t.AddEdge(4, 6, 0);
		System.out.println(t.isCycle());
		
	}
}
