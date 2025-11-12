import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Bellman_ford {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Bellman_ford(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
    }
    class EdgePair{
        int c1,c2,cost;
        public EdgePair(int c1, int c2, int cost) {
            this.c1 = c1;
            this.c2 = c2;
            this.cost = cost;
        }
    }
    List<EdgePair> ll = new ArrayList<>();
    public List<EdgePair> getAllEdge(int src){
        for(int e1 : map.keySet()){
            for(int e2: map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }
    public void Bellmanford(int src){
        int v = map.size();
        int [] dp = new int[v+1];
        //src == 1;
        for(int i = 2; i<dp.length;i++){
            dp[i] = 9999999;
        }
        List<EdgePair> ll = getAllEdge();
        for(int i =1;i<v;i++){
            for(EdgePair e : ll){
                if(i==v && dp[e.c2] > dp[e.c1] + e.cost){
                    System.out,println("Negative Cycle detected");
                    return;
                }    
                if(dp[e.c2] > dp[e.c1] + e.cost){
                    dp[e.c2] = dp[e.c1] + e.cost;
                }    
            }
        }
    }
}