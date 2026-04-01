import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        int[] hills = new int[N];
        
        int minH = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            hills[i] = Integer.parseInt(br.readLine());
            minH = Math.min(minH, hills[i]);
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int L = minH; L <= 83; L++) {
            int R = L + 17;
            
            int cost = calc(L, R, hills);
            answer = Math.min(answer, cost);
        }
        
        System.out.print(answer);
    }
    
    private static int calc(int min, int max, int[] hills) {
        int cost = 0;
        
        for (int h : hills) {
            int diff = 0;
            
            if (h < min) {
                diff = min - h;
            } else if (h > max) {
                diff = h - max;
            }
            
            cost += diff * diff;
        }
        
        return cost;
    }
}