package Graph;
import java.util.*;
public class Graph_2 {
	HashMap<Integer,HashMap<Integer,Integer>>map;
	public Graph_2(int v)
	{
		map=new HashMap<>();
		for(int i=1;i<=v;i++)
		{
			map.put(i,new HashMap<>());
		}
	}
	public void AddEdge(int v1,int v2,int cost)
	{
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean DFS(int src,int des)
	{
		Stack<Integer>st=new Stack<>();
		HashSet<Integer>visited=new HashSet<>();
		st.push(src);
		while(!st.isEmpty())
		{
			//1. remove (rv=remove value)
			int rv=st.pop();
			//2. if Already visited then ignore
			if(visited.contains(rv))
			{
				continue;
			}
			//3. Mark Visited
			visited.add(rv);
			//4. Self work
			if(rv==des)
			{
				return true;
			}
			//5. Add nbrs
			for(int nbrs:map.get(rv).keySet()) 
			{
				if(!visited.contains(nbrs))
				{
					st.push(nbrs);
				}
			}
		}
		return false;
	}
	public void BFT()
	{	
		Queue<Integer>q=new LinkedList<>();
		HashSet<Integer>visited=new HashSet<>();
		for(int src:map.keySet())
		{
			if(visited.contains(src))
			{
				continue;
			}
			q.add(src);
			while(!q.isEmpty())
			{
				//1. remove (rv=remove value)
				int rv=q.poll();
				//2. if Already visited then ignore
				if(visited.contains(rv))
				{
					continue;
				}
				//3. Mark Visited
				visited.add(rv);
				//4. Self work
				System.out.println(rv+" ");
				//5. Add nbrs
				for(int nbrs:map.get(rv).keySet()) 
				{
					if(!visited.contains(nbrs))
					{
						q.add(nbrs);
					}
				}
			}
		}
	}
	public void DFT()
	{
		Stack<Integer>st=new Stack<>();
		HashSet<Integer>visited=new HashSet<>();
		for(int src:map.keySet())
		{
			if(visited.contains(src))
			{
				continue;
			}
			st.push(src);
			while(!st.isEmpty())
			{
				//1. remove (rv=remove value)
				int rv=st.pop();
				//2. if Already visited then ignore
				if(visited.contains(rv))
				{
					continue;
				}
				//3. Mark Visited
				visited.add(rv);
				//4. Self work
				System.out.println(rv+" ");
				//5. Add nbrs
				for(int nbrs:map.get(rv).keySet()) 
				{
					if(!visited.contains(nbrs))
					{
						st.push(nbrs);
					}
				}
			}
		}
		
	}
	public boolean BFS(int src,int des)
	{
		Queue<Integer>q=new LinkedList<>();
		HashSet<Integer>visited=new HashSet<>();
		q.add(src);
		while(!q.isEmpty())
		{
			//1. remove (rv=remove value)
			int rv=q.poll();
			//2. if Already visited then ignore
			if(visited.contains(rv))
			{
				continue;
			}
			//3. Mark Visited
			visited.add(rv);
			//4. Self work
			if(rv==des)
			{
				return true;
			}
			//5. Add nbrs
			for(int nbrs:map.get(rv).keySet()) 
			{
				if(!visited.contains(nbrs))
				{
					q.add(nbrs);
				}
			}
		}
		return false;
	}
}

//5 Steps--remove,ignore,visited, self-work, neighbours.


//Next Question Graph Valid Tree and Question->all paths from source to target.
