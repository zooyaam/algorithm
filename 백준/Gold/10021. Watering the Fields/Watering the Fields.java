import java.io.*;
import java.util.*;

public class Main {
    static class Pipe {
        int from;
        int to;
        int cost;
        
        Pipe(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        // 밭 좌표
        int[][] fields = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            fields[i][0] = Integer.parseInt(st.nextToken());
            fields[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // 유효한 파이프
        List<Pipe> pipes = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int[] f1 = fields[i];
                int[] f2 = fields[j];
                
                int x = f1[0] - f2[0];
                int y = f1[1] - f2[1];
                
                int cost = x*x + y*y;
                
                if (cost >= C) {
                    pipes.add(new Pipe(i, j, cost));
                }
            }
        }
        
        Collections.sort(pipes, (a, b) -> a.cost - b.cost);
        
        // Union-Find 알고리즘
        int[] parent = new int[N];
        for (int i = 0; i < N; i++) parent[i] = i;
        
        int total = 0;
        int cnt = 0;
        
        for (Pipe p : pipes) {
            int a = p.from;
            int b = p.to;
            
            if (find(a, parent) != find(b, parent)) {
                union(a, b, parent);
                total += p.cost;
                cnt++;
            }
        }
        
        if (cnt == N - 1) System.out.print(total);
        else System.out.print(-1);

    }
    
    static int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }
    
    static void union(int a, int b, int[] parent) {
        // 사이클 판단
        a = find(a, parent);
        b = find(b, parent);
        
        if (a != b) parent[b] = a;
    }
}