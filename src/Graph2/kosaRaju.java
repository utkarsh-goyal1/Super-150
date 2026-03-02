package Graph2;
import java.util.*;
public class kosaRaju {
	HashMap<Integer,HashMap<Integer,Integer>>map =new HashMap<>();
	HashMap<Integer,HashMap<Integer,Integer>>map1 =new HashMap<>();
	public kosaRaju(int v) {
		for(int i=0;i<v;i++)
		{
			map.put(i,new HashMap<>());
		}                                                                                                                                                                    
	}
	public void AddEdge(int v1,int v2,int cost)
	{
		map.get(v1).put(v2, 0);
	}
	public void KosaRajuAlgo() {
		
		//dfs all vtx stack me put kardo
		//transpose krna
		//dfs component count karo
		
		HashSet<Integer>visited = new HashSet<>();
		Stack<Integer>st = new Stack<>();
		for(int v:map.keySet())
		{
			if(!visited.contains(v))
			dfs(visited,st,v);
		}
		Transpose(map);
		int count=0;
		visited = new HashSet<>();
		while(!st.isEmpty())
		{
			int vertex=st.pop();
			if(!visited.contains(vertex))
			{
				dfs(map1,visited,vertex);
				System.out.println();
				count++;
			}
			
		}
		System.out.println("Total components are "+count);
	}
	public void dfs(HashMap<Integer,HashMap<Integer,Integer>>map1,HashSet<Integer>visited,int vertex)
	{
		visited.add(vertex);
		System.out.print(vertex+" ");
		for(int nbrs:map1.get(vertex).keySet())
		{
			if(!visited.contains(nbrs))
			{
				dfs(map1,visited,nbrs);
			}
		}
	}
	public void Transpose(HashMap<Integer,HashMap<Integer,Integer>>map)
	{
		for(int v1:map.keySet())
		{
			for(int v2:map.get(v1).keySet())
			{
				if(!map1.containsKey(v2))
				{
					map1.put(v2, new HashMap<>());
				}
				map1.get(v2).put(v1, 0);
			}
		}
		for(int v1:map.keySet()) 
		{
			if(!map1.containsKey(v1)) {
				map1.put(v1, new HashMap<>());
			}
		}
	}
	public void dfs(HashSet<Integer>visited,Stack<Integer>st, int vtx)
	{
		visited.add(vtx);
		for(int nbrs:map.get(vtx).keySet()) 
		{
			if(!visited.contains(nbrs)) 
			{
				dfs(visited,st,nbrs);
			}
		}
		st.push(vtx);
	}                                  
	public static void main(String []args)
	{
		kosaRaju t = new kosaRaju(5);
		t.AddEdge(0, 2, 0);
		t.AddEdge(2, 1, 0);
		t.AddEdge(1, 0, 0);
		t.AddEdge(2, 3, 0);
		t.AddEdge(3, 4, 0);
		t.AddEdge(4, 3, 0);
		t.KosaRajuAlgo();
	}
}
//import java.util.*;
//public class Main
//{
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//		HashMap<Integer,HashMap<Integer,Integer>>h = new HashMap<>();
//		HashMap<Integer,HashMap<Integer,Integer>>h2 = new HashMap<>();
//		int vertex=sc.nextInt();
//		int edges= sc.nextInt();
//		for(int i=0;i<vertex;i++)
//		{
//		    h.put(i,new HashMap<>());
//		    h2.put(i,new HashMap<>());
//		}
//		for(int i=0;i<edges;i++)
//		{
//		    int source=sc.nextInt();
//		    int dest=sc.nextInt();
//		    h.get(source).put(dest,0);
//		}
//		printComponents(h,h2,vertex);
//	}
//	public static void printComponents(HashMap<Integer,HashMap<Integer,Integer>>h,HashMap<Integer,HashMap<Integer,Integer>>h2,int vertex)
//	{
//	    HashSet<Integer>visited = new HashSet<>();
//	    Stack<Integer>st = new Stack<>();
//	    for(int v:h.keySet())
//	    {
//	        if(!visited.contains(v))
//	        {
//	            DFS(h,visited,st,v);
//	        }
//	    }
//	    Transpose(h,h2);
//	    int count=0;
//	    HashSet<Integer>s = new HashSet<>();
//	    while(!st.isEmpty())
//	    {
//	        int curr=st.pop();
//	        if(!s.contains(curr))
//	        {
//	            DFS2(h2,s,curr);
//	            System.out.println();
//	            count++;
//	        }
//	        
//	    }
//	    System.out.println(count);
//	}
//	public static void DFS2(HashMap<Integer,HashMap<Integer,Integer>>h2,HashSet<Integer>s,int v)
//	{
//	    s.add(v);
//	    System.out.print(v+" ");
//	    for(int nbrs:h2.get(v).keySet())
//	    {
//	        if(!s.contains(nbrs))
//	        {
//	            DFS2(h2,s,nbrs);
//	        }
//	    }
//	}
//	public static void Transpose(HashMap<Integer,HashMap<Integer,Integer>>h,HashMap<Integer,HashMap<Integer,Integer>>h2)
//	{
//	    for(int v:h.keySet())
//	    {
//	        for(int nbrs:h.get(v).keySet())
//	        {
//	            if(!h2.containsKey(nbrs))
//	            {
//	                h2.put(nbrs,new HashMap<>());
//	            }
//	            h2.get(nbrs).put(v,0);
//	        }
//	    }
//	    for(int v:h.keySet())
//	    {
//	        if(!h2.containsKey(v))
//	        {
//	            h2.put(v,new HashMap<>());
//	        }
//	    }
//	}
//	public static void DFS(HashMap<Integer,HashMap<Integer,Integer>>h,HashSet<Integer>visited,Stack<Integer>st,int vertex)
//	{
//	    visited.add(vertex);
//	    for(int nbrs:h.get(vertex).keySet())
//	    {
//	        if(!visited.contains(nbrs))
//	        {
//	            DFS(h,visited,st,nbrs);
//	        }
//	    }
//	    st.add(vertex);
//	}
//}
