import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        if (N < 3) {
            System.out.print(N);
            return;
        }
        
        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;
        
        int i = 3;
        while (i <= N) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
            i++;
        }
        
        System.out.print(dp[N]);
    }
}