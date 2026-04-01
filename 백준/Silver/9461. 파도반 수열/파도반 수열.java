import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        int max = 0;
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        
        long[] dp = new long[Math.max(6, max + 1)];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        
        for (int i = 6; i <= max; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(dp[arr[i]]);
        }
    }
}