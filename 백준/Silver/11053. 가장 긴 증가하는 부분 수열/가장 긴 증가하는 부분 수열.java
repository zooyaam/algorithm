import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] dp = new int[N];
        
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (num[j] < num[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        
        System.out.print(max);
    }
}