class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        
        for (int i = 0; i < board.length && i <= k; i++) {
            for (int j = 0; j < board[i].length && i + j <= k; j++) {
                sum += board[i][j];
            }
        }
        
        return sum;
    }
}