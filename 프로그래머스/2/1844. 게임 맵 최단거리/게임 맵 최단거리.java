import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        // 시작점
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while (!q.isEmpty()) {
            // 현재 좌표
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            int d = curr[2];
            
            // 목적지 도달
            if (x == n-1 && y == m-1) {
                return d;
            }
            
            // bfs
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nd = d + 1;
                
                if ((nx >= 0 && ny >= 0 && nx < n && ny < m) 
                   && !visited[nx][ny]
                   && maps[nx][ny] != 0) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, nd});
                }
            }
        }
        
        return -1;
    }
}