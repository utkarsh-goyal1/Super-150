package Graph;
import java.util.*;
public class Bipartite_Graph {
	class solution{
		public boolean isBipartite(int[][]graph)
		{
			HashMap<Integer,Integer>visited=new HashMap<>();//keys are visited nodes and values are their corresponding distances from the source node.
			Queue<BipartitePair>q=new LinkedList<>();
			for(int i=0;i<graph.length;i++)
			{
				if(visited.containsKey(i))
				{
					continue;
				}
				q.add(new BipartitePair(i,0));
				while(!q.isEmpty())
				{
					BipartitePair rp=q.poll();
					if(visited.containsKey(rp.vtx))
					{
						if(visited.get(rp.vtx)!=rp.des)
						{
							return false;
						}
					}
					visited.put(rp.vtx, rp.des);
					for(int nbrs:graph[rp.vtx])
					{
						if(!visited.containsKey(nbrs))
						{
							q.add(new BipartitePair(nbrs,rp.des+1));
						}
					}
				}
			}
			return true;
		}
	}
	class BipartitePair{
		int vtx;
		int des;
		public BipartitePair(int vtx,int des)
		{
			this.vtx=vtx;
			this.des=des;
		}
	}
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, HashSet<Integer>> h = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            h.put(i, new HashSet<>());
            for (int j = 0; j < graph[i].length; j++) {
                h.get(i).add(graph[i][j]);
            }
        }
        int []color= new int[graph.length];
        //0=no color
        //1=blue
        //-1 red
        for (int i = 0; i < graph.length; i++) 
        {
            if (color[i]==0 && (!isValid(h,color,1,i))) 
            {
                 return false;
            }
        }
        return true;
    }
    public boolean isValid(HashMap<Integer,HashSet<Integer>>h,int []color,int colour,int node)
    {
        if(color[node]!=0)
        {
            return color[node]==colour;
        }
        color[node]=colour;
        for(int nbrs:h.get(node))
        {
            if(!isValid(h,color,-colour,nbrs))return false;
        }
        return true;
    }
}