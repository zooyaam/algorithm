import java.util.*;

class Solution {
    public class Edge {
        int to;
        int cost;
        
        Edge (int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    
    public class State {
        int node;
        int cost;
        
        State (int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        List<Edge>[] graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();
        
        for (int[] r : road) {
            graph[r[0]].add(new Edge(r[1], r[2]));
            graph[r[1]].add(new Edge(r[0], r[2]));
        }
        
        PriorityQueue<State> pq = new PriorityQueue<>(
            (a, b) -> a.cost - b.cost
        );
        pq.offer(new State(1, 0));
        
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        while (!pq.isEmpty()) {
            State st = pq.poll();
            
            if (st.cost > dist[st.node]) continue;
            
            for (Edge e : graph[st.node]) {
                int cost = st.cost + e.cost;
                if (dist[e.to] > cost) {
                    dist[e.to] = cost;
                    pq.offer(new State(e.to, cost));
                }
            }
        }
        
        int result = 0;
        
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) result++;
        }
        
        return result;
    }
}