import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        // [[a1, b1], [a2, b2], ...]
        int[][] lines = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // A 기준 asc 정렬
        Arrays.sort(lines, (l1, l2) -> l1[0] - l2[0]);
        
        // B 추출
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = lines[i][1];
        }
        
        int[] dp = new int[N];
        
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (b[j] < b[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        
        System.out.print(N - max);
    }
}