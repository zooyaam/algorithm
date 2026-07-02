class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        int dir = 0;
        
        int x = 0;
        int y = 0;
        arr[x][y] = 1;
        
        int lastN = n * (n + 1) / 2;
        
        for (int i = 2; i <= lastN; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || nx >= n || ny < 0 || ny > nx || arr[nx][ny] != 0) {
                dir = (dir + 1) % 3;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
            arr[x][y] = i;
        }
        
        int idx = 0;
        int[] result = new int[lastN];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int num = arr[i][j];
                
                result[idx] = num;
                idx++;
            }
        }
        
        return result;
    }
}