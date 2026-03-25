import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int sc : scoville) {
            pq.add(sc);
        }
        
        int scale = 0;
        int cnt = 0;
        
        while (pq.peek() < K) {
            if (pq.size() < 2) return -1;
            
            int s1 = pq.poll();
            int s2 = pq.poll();
            
            scale = s1 + (s2 * 2);
            
            pq.add(scale);
            cnt++;
        }
        
        return cnt;
    }
}