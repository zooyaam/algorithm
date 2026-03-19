import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] board = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            for (int j = 0; j < M; j++) {
                char c = line.charAt(j);
                
                if (c == 'B') board[i][j] = 1;
                else board[i][j] = 0;
            }
        }
        
        int result = Integer.MAX_VALUE;
        
        for (int n = 0; n <= N - 8; n++) {
            for (int m = 0; m <= M - 8; m++) {
                result = Math.min(result, brute(board, n, m));
            }
        }
        
        System.out.println(result);
    }
    
    private static int brute(int[][] board, int n, int m) {
        int startBCnt = 0;
        int startWCnt = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int curr = board[n + i][m + j];
                if ((i + j) % 2 == 0) {
                    if (curr == 0) startBCnt++;
                    else startWCnt++;
                } else {
                    if (curr == 0) startWCnt++;
                    else startBCnt++;
                }
            }
        }
        
        return Math.min(startBCnt, startWCnt);
    }
}