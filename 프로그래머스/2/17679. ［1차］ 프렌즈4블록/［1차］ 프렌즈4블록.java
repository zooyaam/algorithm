class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] matrix = new char[m][n];
        
        for (int i = 0; i < m; i++) {
            matrix[i] = board[i].toCharArray();
        }
        
        int cnt = 0;
        
        while (true) {
            boolean[][] deletePos = new boolean[m][n];
            boolean found = false;
            
            // 2*2 탐색 후 저장
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = matrix[i][j];
                    
                    if (c != ' ' &&
                        c == matrix[i][j+1] &&
                        c == matrix[i+1][j] &&
                        c == matrix[i+1][j+1]) {
                        deletePos[i][j] = true;
                        deletePos[i][j+1] = true;
                        deletePos[i+1][j] = true;
                        deletePos[i+1][j+1] = true;
                        
                        found = true;
                    }
                }
            }
            
            // !! 제거할 블록이 없다면 종료
            if (!found) break;
            
            // 블록 제거
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (deletePos[i][j]) {
                        matrix[i][j] = ' ';
                        cnt++;
                    }
                }
            }
            
            // 떨어지는 블록 처리
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (matrix[i][j] == ' ') {
                        for (int k = i - 1; k >= 0; k--) {
                            if (matrix[k][j] != ' ') {
                                matrix[i][j] = matrix[k][j];
                                matrix[k][j] = ' ';
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return cnt;
    }
}