import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        int sum = 0;
        for (int work : works) sum += work;
        if (sum <= n) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int work : works) {
            pq.offer(work);
        }
        
        while (n > 0) {
            int w = pq.poll();
            pq.offer(w - 1);
            n--;
        }
        
        long result = 0;
        while (!pq.isEmpty()) {
            int w = pq.poll();
            result += w * w;
        }
        
        return result;
    }
}