package Graph;
import java.util.*;
import Graph.Prims.PrimsPair;
public class MST01 {
	private HashMap<Integer,HashMap<Integer,Integer>> map= new HashMap<>();
	public MST01(int v) {
		for(int i=1;i<=v;i++)
		{
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int a,int b,int cost)
	{
		map.get(a).put(b, cost);
		map.get(b).put(a, cost);
	}
	class PrimsPair{
		int e1;
		int acqv;
		int cost;
		public PrimsPair(int e1,int acqv,int cost) {
			this.e1=e1;
			this.acqv=acqv;
			this.cost=cost;
		}
		public String toString()
		{
			return this.e1+" "+this.acqv+" @ "+this.cost;
		}
	}
	public void Prims() {
		PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				return o1.cost-o2.cost;
			}
		});
		int ans=0;
		pq.add(new PrimsPair(1,1,0));
		HashSet<Integer>visited=new HashSet<>();
		while(!pq.isEmpty()) {
			PrimsPair rp =pq.poll();
			if(visited.contains(rp.e1)) 
			{
				continue;
			}
			visited.add(rp.e1);
			ans+=rp.cost;
//			System.out.println(rp);
			for(int nbrs=1;nbrs<=map.size();nbrs++) {
				if(!visited.contains(nbrs)) {
					int cost=0;
					if(map.get(rp.e1).containsKey(nbrs))
					{
						cost=1;
					}
//					cost=map.get(rp.e1).get(nbrs);
					pq.add(new PrimsPair(nbrs,rp.e1,cost));
				}
			}
			
		}
		System.out.println(ans);
	}
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//vertex
		int m=sc.nextInt();//edge
		MST01 ms=new MST01(n);
		for(int i=0;i<m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int cost=1;
			ms.AddEdge(a, b, cost);
		}
		ms.Prims();
	}
}

//Here we are not making the complete graph due to the constraints . We are including the edges which have cost 1.
