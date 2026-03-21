import java.io.*;

public class Main {
    static int N;
    static int[] board;
    static int result;
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        N = Integer.parseInt(br.readLine());
        board = new int[N];
        
        dfs(0);
        
        System.out.println(result);
    }
    
    private static void dfs(int row) {
        if (row == N) {
            result++;
            return;
        }
        
        for (int col = 0; col < N; col++) {
            if (canPlace(row, col)) {
                board[row] = col;
                dfs(row + 1);
            }
        }
    }
    
    private static boolean canPlace(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(row - i) == Math.abs(col - board[i])) return false;
        }
        
        return true;
    }
}