package Graph;
import java.util.*;
public class Graph {
	//for undirected weighted graphs.
	HashMap<Integer,HashMap<Integer,Integer>>map;
	public Graph(int v)
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
	public boolean ContainsEdge(int v1,int v2)
	{
		return map.get(v1).containsKey(v2);
	}
	public boolean ContainsVertex(int v1)
	{
		return map.containsKey(v1);
	}
	public int noOfEdges()
	{
		int ans=0;
		for(Map.Entry<Integer,HashMap<Integer,Integer>>e:map.entrySet())
		{
			ans+=e.getValue().size();
		}
		return ans/2;
	}
	public void removeEdge(int v1,int v2)
	{
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void removeVertex(int v1)//nbrs=neighbours
	{
		for(int nbrs:map.get(v1).keySet())
		{
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	public void Display()
	{
		for(Map.Entry<Integer,HashMap<Integer,Integer>>e:map.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}
	public boolean hasPath(int src,int des,HashSet<Integer>visited)
	{
		if(src==des)
		{
			return true;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet())
		{
			if(!visited.contains(nbrs))//if node is not visited only then we will visit the node.
			{
				boolean ans=hasPath(nbrs,des,visited);
				if(ans)
				{
					return ans;
				}
			}
		}
		return false;
	}
	public void printAllPath(int src,int des,HashSet<Integer>visited,String ans)
	{
		if(src==des)
		{
			System.out.println(ans+des);
			return ;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet())
		{
			if(!visited.contains(nbrs))//if node is not visited only then we will visit the node.
			{
				printAllPath(nbrs,des,visited,ans+src);
				
			}
		}
		visited.remove(src);
	}
}
