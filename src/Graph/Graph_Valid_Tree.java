package Graph;
import java.util.*;
public class Graph_Valid_Tree {
	class Solution
	{
		public boolean validTree(int n,int [][]edges)
		{
			HashMap<Integer,List<Integer>>map=new HashMap<>();
			for(int i=0;i<n;i++)
			{
				map.put(i, new ArrayList<>());
			}
			for(int i=0;i<edges.length;i++)
			{
				int src=edges[i][0];
				int des=edges[i][1];
				map.get(src).add(des);
				map.get(des).add(src);
			}
			return DFT(map);
		}
		public boolean DFT(HashMap<Integer,List<Integer>>map)
		{
			Stack<Integer>st=new Stack<>();
			HashSet<Integer>visited=new HashSet<>();
			int c=0;
			for(int src:map.keySet())
			{
				if(visited.contains(src))
				{
					continue;
				}
				c++;
				st.push(src);
				while(!st.isEmpty())
				{
					//1. remove (rv=remove value)
					int rv=st.pop();
					//2. if Already visited then ignore
					if(visited.contains(rv))
					{
						return false;
					}
					//3. Mark Visited
					visited.add(rv);
					//4. Self work
					//System.out.println(rv+" ");
					//5. Add nbrs
					for(int nbrs:map.get(rv)) 
					{
						if(!visited.contains(nbrs))
						{
							st.push(nbrs);
						}
					}
				}
			}
			if(c==1)
			{
				return true;
			}
			return false;
		}

	}
}


//All the trees are graphs but all the graphs are not tree.To check a graph is tree or not , the graph should not have any cycle and the graph should not be disconnected.
//logic ->After applying BFS hashset size should be equal to the total nodes.


//Next Question -is Graph Bipartite?
