import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += temp[i];
        }
        
        int max = sum;
        
        for (int i = 0; i < N-K; i++) {
            sum = sum - temp[i] + temp[i+K];
            max = Math.max(sum, max);
        }
        
        System.out.print(max);
    }
}