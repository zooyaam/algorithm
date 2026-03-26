import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st;
        
        // 9*9 스도쿠 생성
        int[][] board = new int[9][9];
        
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // dfs
        dfs(board);
        
        // 정답 출력
        StringBuilder sb = new StringBuilder();
                    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board[i][j]).append(' ');
            }
            sb.append('\n');
        }
        
        System.out.println(sb.toString());
    }
    
    private static boolean dfs(int[][] board) {
        // 빈 칸 탐색
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] == 0) {
                    for (int n = 1; n < 10; n++) {
                        if (canPlace(board, i, j, n)) {
                            board[i][j] = n;
                            if (dfs(board)) return true;
                            
                            // 실패할 경우 백트래킹
                            board[i][j] = 0;
                        }
                    }
                    
                    // 모든 숫자를 넣을 수 없을 경우
                    return false;
                }
            }
        }
        
        // 빈 칸이 존재하지 않는다면 성공!
        return true;
    }

    private static boolean canPlace(int[][] board, int row, int col, int n) {
        // 같은 행 검사
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == n) return false;
        }
        
        // 같은 열 검사
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == n) return false;
        }
        
        // 같은 블록 검사
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == n) return false;
            }
        }
        
        // 모든 검사를 통과하면 n넣기 가능
        return true;
    }
}