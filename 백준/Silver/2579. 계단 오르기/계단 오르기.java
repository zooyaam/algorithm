import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        int[] stair = new int[N];
        for (int i = 0; i < N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        
        if (N < 2) {
            System.out.print(stair[0]);
            return;
        }
        
        int[] dp = new int[N];
        dp[0] = stair[0];
        dp[1] = stair[0] + stair[1];
        
        if (N >= 3) {
            dp[2] = Math.max(
                stair[0] + stair[2],
                stair[1] + stair[2]
            );
        }
        
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(
                dp[i-2],
                dp[i-3] + stair[i-1]
            ) + stair[i];
        }
        
        System.out.print(dp[N-1]);
    }
}