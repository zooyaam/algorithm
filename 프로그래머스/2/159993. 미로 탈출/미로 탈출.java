import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        char[][] board = new char[n][m];
        int[] start = new int[2];
        int[] lever = new int[2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                board[i][j] = c;
                
                if (c == 'S') {
                    start[0] = i;
                    start[1] = j;
                };
                if (c == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                }
            }
        }
        
        int sl = bfs(n, m, board, start, 'L');
        int le = bfs(n, m, board, lever, 'E');
        
        if (sl < 0 || le < 0) return -1;
        else return sl + le;
    }
    
    public int bfs(int n, int m, char[][] board, int[] start, char target) {
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        que.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while (!que.isEmpty()) {
            int[] curr = que.poll();
            
            for (int d = 0; d < 4; d++) {
                int nx = curr[0] + dx[d];
                int ny = curr[1] + dy[d];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || board[nx][ny] == 'X' || visited[nx][ny]) continue;
                
                if (board[nx][ny] == target) return curr[2] + 1;
                
                que.offer(new int[]{nx, ny, curr[2] + 1});
                visited[nx][ny] = true;
            }
        }
        
        return -1;
    }
}