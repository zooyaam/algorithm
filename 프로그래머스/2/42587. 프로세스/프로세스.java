import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[]{priorities[i], i});
            pq.offer(priorities[i]);
        }
        
        int order = 0;
        
        while (!q.isEmpty()) {
            int max = pq.peek();
            int[] curr = q.poll();
        
            if (curr[0] == max) {
                order++;
                pq.poll();
                
                if (curr[1] == location) return order;
            } else {
                q.offer(curr);
            }
        }
        
        return order;
    }
}