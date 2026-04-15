import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] sum = new int[N+1]; // 누적합 배열
        int[] count = new int[M]; // 나머지 배열
        
        count[0] = 1;
        
        for (int i = 1; i <= N; i++) {
            int v = Integer.parseInt(st.nextToken());
            sum[i] = (v + sum[i-1]) % M;
            count[sum[i]]++;
        }
        
        long cnt = 0;
        for (int i = 0; i < M; i++) {
            cnt += (long) count[i] * (count[i] - 1) / 2;
        }
        
        System.out.print(cnt);
    }
}