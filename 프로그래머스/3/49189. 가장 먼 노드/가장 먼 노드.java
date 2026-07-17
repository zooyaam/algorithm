import java.util.*;

class Solution {
    List<Integer>[] graph;
    int[] dist;
    Queue<Integer> que = new LinkedList<>();
    
    public int solution(int n, int[][] edge) {
        graph = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        dist = new int[n+1];
        Arrays.fill(dist, -1);
        
        que.offer(1);
        dist[1] = 0;
        
        bfs();
        
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }
        
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == max) result++;
        }
        
        return result;
        
    }
    
    public void bfs() {
        while (!que.isEmpty()) {
            int curr = que.poll();
            
            for (int next : graph[curr]) {
                if (dist[next] != -1) continue;
                
                dist[next] = dist[curr] + 1;
                que.offer(next);
            }
        }
    }
}