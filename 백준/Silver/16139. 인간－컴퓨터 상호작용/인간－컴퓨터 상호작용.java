import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        String S = br.readLine();
        int Q = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[26][S.length() + 1];
        
        for (int i = 0; i < S.length(); i++) {
            // 알파벳 인덱스 (0~25)
            int a = S.charAt(i) - 'a';
            
            for (int j = 0; j < 26; j++) {
                dp[j][i+1] = dp[j][i];
            }
            
            dp[a][i+1]++;
        }
        
        StringTokenizer st;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            sb.append(dp[a][r+1] - dp[a][l]).append('\n');
        }
        
        System.out.print(sb);
    }
}