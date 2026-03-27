import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder dfsRes = new StringBuilder();
    static StringBuilder bfsRes = new StringBuilder();
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 노드 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수
        int V = Integer.parseInt(st.nextToken()); // 시작 노드
        
        // 양방향 그래프 생성
        List<Integer>[] graph = new ArrayList[N+1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            
            graph[n1].add(n2);
            graph[n2].add(n1);
        }
        
        for (int i = 1; i <= N; i++) {
            // 오름차순 정렬
            Collections.sort(graph[i]);
        }
        
        boolean[] visited = new boolean[N+1];
        dfs(V, visited, graph);
        
        visited = new boolean[N+1];
        bfs(V, visited, graph);
        
        System.out.println(dfsRes.toString());
        System.out.println(bfsRes.toString());
    }
    
    static void dfs (int curr, boolean[] visited, List<Integer>[] graph) {
        visited[curr] = true;
        dfsRes.append(curr).append(' ');
        
        for (int next : graph[curr]) {
            if (!visited[next]) dfs(next, visited, graph);
        }
    }
    
    static void bfs (int start, boolean[] visited, List<Integer>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        visited[start] = true;
        bfsRes.append(start).append(' ');
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int next : graph[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    
                    bfsRes.append(next).append(' ');
                }
            }
        }
    }
}