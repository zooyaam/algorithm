import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0, sum2 = 0;
        
        for (int i = 0; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            sum1 += queue1[i];
            
            q2.offer(queue2[i]);
            sum2 += queue2[i];
        }
        
        if ((sum1 + sum2) % 2 != 0) return -1;
        
        int cnt = 0;
        int limit = 3 * queue1.length;
        
        while (sum1 != sum2 && cnt < limit) {
            if (sum1 == 0 || sum2 == 0) return -1;
            
            if (sum1 > sum2) {
                int n1 = q1.poll();
                q2.offer(n1);
                
                sum1 -= n1;
                sum2 += n1;
            }
            else if (sum2 > sum1) {
                int n2 = q2.poll();
                q1.offer(n2);
                
                sum2 -= n2;
                sum1 += n2;
            }
            
            cnt++;
        }
        
        return sum1 == sum2 ? cnt : -1;
    }
}