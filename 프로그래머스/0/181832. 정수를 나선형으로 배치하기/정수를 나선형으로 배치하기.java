class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        int x = 0;
        int y = 0;
        int dir = 0;
        
        for (int i = 1; i <= n * n; i++) {
            arr[x][y] = i;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx >= n || ny >= n || nx < 0 || ny < 0 || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
        }
        
        return arr;
    }
}