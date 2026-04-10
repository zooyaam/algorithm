import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        if (N < 2) {
            System.out.print(1);
            return;
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] left_dp = new int[N];
        for (int i = 0; i < N; i++) {
            left_dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) left_dp[i] = Math.max(left_dp[i], left_dp[j] + 1);
            }
        }
        
        int[] right_dp = new int[N];
        for (int i = N-1; i >= 0; i--) {
            right_dp[i] = 1;
            
            for (int j = N-1; j > i; j--) {
                if (A[j] < A[i]) right_dp[i] = Math.max(right_dp[i], right_dp[j] + 1);
            }
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, left_dp[i] + right_dp[i] - 1);
        }
        
        System.out.print(max);
    }
}