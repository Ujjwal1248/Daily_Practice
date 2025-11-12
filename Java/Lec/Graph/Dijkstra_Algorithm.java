import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Dijkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}
    class DijkstraPair{
    	int vtx;
        String acqpath;
    	int cost;
    	public DijkstraPair(int v,String acqpath,int cost) {
            this.vtx = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }
    }
    public void Dijkstra(){
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)->a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pd.add(new DijkstraPair(1,"1",0));
        while(!pq.isEmpty()){
            DijkstraPair rp = rp.poll();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for(int nbrs : map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs,rp.acqpath + nbrs,rp.cost + cost));
                }
            }

        }
    }
}
