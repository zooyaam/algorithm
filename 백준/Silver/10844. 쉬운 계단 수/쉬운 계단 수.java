import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        // [길이(N)][끝자리 수]
        long[][] dp = new long[N+1][10];
        
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        // DP
        for (int n = 2; n <= N; n++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    dp[n][0] = dp[n-1][1] % 1000000000;
                } else if (i == 9) {
                    dp[n][9] = dp[n-1][8] % 1000000000;
                } else {
                    dp[n][i] = (dp[n-1][i-1] + dp[n-1][i+1]) % 1000000000;
                }
            }
        }
        
        long cnt = 0;
        for (int i = 0; i < 10; i++) {
            cnt += dp[N][i];
        }
        
        System.out.print(cnt % 1000000000);
    }
}