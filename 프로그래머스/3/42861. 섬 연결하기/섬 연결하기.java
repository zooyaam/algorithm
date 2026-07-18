import java.util.*;

class Solution {
    public class Edge {
        int to;
        int cost;
        
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    
    public int solution(int n, int[][] costs) {
        // 그래프 생성
        List<Edge>[] graph = new ArrayList[n+1];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        for (int[] cost : costs) {
            graph[cost[0]].add(new Edge(cost[1], cost[2]));
            graph[cost[1]].add(new Edge(cost[0], cost[2]));
        }
        
        // 탐색 - Prim
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        for (Edge e : graph[0]) pq.offer(e);
        
        int total = 0;
        
        boolean[] connected = new boolean[n];
        connected[0] = true;
        
        int cnt = 1;
        while (cnt < n) {
            Edge e = pq.poll();
            while (connected[e.to]) e = pq.poll();
            
            connected[e.to] = true;
            
            for (Edge next : graph[e.to]) pq.offer(next);
            
            total += e.cost;
            cnt++;
        }
        
        return total;
    }
}