import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<Integer>[] nodes = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) nodes[i] = new ArrayList<>();
        
        for (int[] wire : wires) {
            nodes[wire[0]].add(wire[1]);
            nodes[wire[1]].add(wire[0]);
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int[] wire : wires) {
            // 건너 뛸 간선
            int w1 = wire[0];
            int w2 = wire[1];
            
            // 탐색
            int cnt = bfs(w1, w1, w2, n, nodes);
            int diff = Math.abs(cnt - (n - cnt));
            
            min = Math.min(min, diff);
        }
        
        return min;
    }
    
    int bfs (int s, int w1, int w2, int n, List<Integer>[] nodes) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        
        q.add(s);
        visited[s] = true;
        
        int cnt = 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int next : nodes[curr]) {
                if ((curr == w1 && next == w2) || 
                    (curr == w2 && next == w1)) continue;

                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}