import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] board = new int[rows][columns];
        
        int num = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                board[r][c] = num;
                num++;
            }
        }
        
        int[] result = new int[queries.length];
        
        // 우하좌상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        for (int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1; // 시작점 row
            int y1 = queries[i][1] - 1; // 시작점 col
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            
            // 테두리 도는 법
            // x1, y1에서 시작
            // x1, y2가 될때까지 dx[0] dy[0]
            // x2, y2가 될때까지 dx[1] dy[1]
            // x2, y1가 될때까지 dx[2] dy[2]
            // x1-1, y1-1이 될때까지 dx[3] dy[3]
            
            Deque<Integer> deq = new ArrayDeque<>();
            
            // 1. 회전하며 deq.add(num)
            int x = x1;
            int y = y1;
            deq.add(board[x][y]);
            
            int min = board[x][y];
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                while (nx >= x1 && nx <= x2 && ny >= y1 && ny <= y2) {
                    x = nx;
                    y = ny;
                    deq.add(board[x][y]);
                    
                    nx = x + dx[d];
                    ny = y + dy[d];
                    
                    min = Math.min(min, board[x][y]);
                }
            }
            
            // 2. 최솟값 result[] 저장
            result[i] = min;
            
            // 3. 회전 값 배치
            x = x1;
            y = y1;
            board[x][y] = deq.pollLast();
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                while (nx >= x1 && nx <= x2 && ny >= y1 && ny <= y2) {
                    x = nx;
                    y = ny;
                    board[x][y] = deq.poll();
                    
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
            }
        }
        
        return result;
    }
}