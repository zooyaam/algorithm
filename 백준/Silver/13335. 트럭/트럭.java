import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        // 첫 번째 줄 (n, w, L)
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        // 두 번째 줄 (weights array)
        st = new StringTokenizer(br.readLine());
        
        int[] weights = new int[n];
        
        for (int i = 0; i < n ; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }
        
        // 문제 풀이
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        
        int currW = 0;
        int truckIdx = 0;
        
        while (truckIdx < n || currW > 0) {
            currW -= bridge.poll();
            
            if (truckIdx < n && currW + weights[truckIdx] <= L) {
                bridge.offer(weights[truckIdx]);
                currW += weights[truckIdx];
                truckIdx++;
            } else {
                bridge.offer(0);
            }
            
            time++;
        }
        
        System.out.println(time);
    }
}