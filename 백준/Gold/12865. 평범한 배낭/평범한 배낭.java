import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] items = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            items[i][0] = Integer.parseInt(st.nextToken()); // 무게 W
            items[i][1] = Integer.parseInt(st.nextToken()); // 가치 V
        }
        
        int[][] dp = new int[N+1][K+1];
        
        for (int n = 1; n <= N; n++) {
            int w = items[n-1][0];
            int v = items[n-1][1];
            
            for (int k = 0; k <= K; k++) {
                if (k >= w) {
                    dp[n][k] = Math.max(dp[n-1][k], dp[n-1][k-w] + v);
                } else {
                    dp[n][k] = dp[n-1][k];
                }
                
            }
        }
        
        System.out.print(dp[N][K]);
    }
}