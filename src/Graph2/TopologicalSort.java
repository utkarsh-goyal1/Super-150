//A topological sort is a linear ordering of vertices in a directed acyclic graph (DAG).
package Graph2;
import java.util.*;
public class TopologicalSort {
	HashMap<Integer,HashMap<Integer,Integer>>map =new HashMap<>();
	public TopologicalSort(int v) {
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
	public void Topological() {
		int []in =inDegree();
		Queue<Integer>q =new LinkedList<>();
		for(int i=1;i<in.length;i++)
		{
			if(in[i]==0)
			{
				q.add(i);
			}
		}
		while(!q.isEmpty())
		{
			int curr=q.poll();
			System.out.println(curr);
			for(int nbrs:map.get(curr).keySet())
			{
				in[nbrs]--;
				if(in[nbrs]==0)
				{
					q.add(nbrs);
				}
			}
		}
		System.out.println();
	}
	public static void main(String []args)
	{
		TopologicalSort t = new TopologicalSort(6);
		t.AddEdge(1, 2, 0);
		t.AddEdge(1, 3, 0);
		t.AddEdge(2, 4, 0);
		t.AddEdge(3, 4, 0);
		t.AddEdge(4, 5, 0);
		t.AddEdge(4, 6, 0);
		t.Topological();
		
	}
}
 
//Course Schedule -> Course schedule2
