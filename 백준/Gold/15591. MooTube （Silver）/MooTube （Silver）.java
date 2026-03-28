import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    
    static class Edge {
        int to;
        int usado;
        
        Edge(int to, int usado) {
            this.to = to;
            this.usado = usado;
        }
    }
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        List<Edge>[] graph = new ArrayList[N+1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            
            graph[n1].add(new Edge(n2, u));
            graph[n2].add(new Edge(n1, u));
        }
        
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            
            int K = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            boolean[] visited = new boolean[N+1];
            
            cnt = 0;
            dfs(K, v, visited, graph);
            
            System.out.println(cnt);
        }
    }
    
    static void dfs(int K, int curr, boolean[] visited, List<Edge>[] graph) {
        visited[curr] = true;
        
        for (Edge next : graph[curr]) {
            int nextNode = next.to;
            int usado = next.usado;
            
            if (!visited[nextNode] && usado >= K) {
                dfs(K, nextNode, visited, graph);
                cnt++;
            }
        }
    }
}