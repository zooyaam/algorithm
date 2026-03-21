import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<int[]> dq = new ArrayDeque<>();
        
        for (int i = 1; i <= N; i++) {
            int[] balloon = new int[]{Integer.parseInt(st.nextToken()), i};
            dq.addLast(balloon);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!dq.isEmpty()) {
            int[] balloon = dq.removeFirst();
            sb.append(balloon[1]).append(' ');
            
            if (dq.isEmpty()) break;
            
            if (balloon[0] > 0) {
                for (int i = 0; i < balloon[0] - 1; i++) {
                    int[] temp = dq.removeFirst();
                    dq.addLast(temp);
                }
            } else {
                for (int i = 0; i < -balloon[0]; i++) {
                    int[] temp = dq.removeLast();
                    dq.addFirst(temp);
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}