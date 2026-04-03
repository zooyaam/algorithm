import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        int[][] nums = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j <= i; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] dp = new int[N][N];
        dp[0][0] = nums[0][0];
        
        for (int i = 1; i < N; i++) {
            dp[i][0] = dp[i-1][0] + nums[i][0];
            dp[i][i] = dp[i-1][i-1] + nums[i][i];
            
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + nums[i][j];
            }
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[N-1][i]);
        }
        
        System.out.print(max);
    }
}