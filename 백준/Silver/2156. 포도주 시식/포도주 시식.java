import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        int[] juice = new int[N];
        for (int i = 0; i < N; i++) {
            juice[i] = Integer.parseInt(br.readLine());
        }
        
        if (N < 2) {
            System.out.print(juice[0]);
            return;
        }
        
        int[] dp = new int[N];
        dp[0] = juice[0];
        dp[1] = juice[0] + juice[1];
        
        if (N >= 3) {
            dp[2] = Math.max(
                dp[1],
                Math.max(juice[0] + juice[2], juice[1] + juice[2])
            );
        }
        
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i-1],
                Math.max(dp[i-2] + juice[i],
                        dp[i-3] + juice[i-1] + juice[i]));
        }
        
        System.out.print(dp[N-1]);
    }
}