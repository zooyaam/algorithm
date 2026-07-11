import java.util.*;

class Solution {
    public class Server {
        int returnTime; // 서버 반납시간
        
        Server (int returnTime) {
            this.returnTime = returnTime;
        }
    }
    
    public int solution(int[] players, int m, int k) {
        int result = 0;
        
        PriorityQueue<Server> pq = new PriorityQueue<>(
            (a, b) -> a.returnTime - b.returnTime    
        );
        
        for (int i = 0; i < players.length; i++) {
            while (!pq.isEmpty() && pq.peek().returnTime == i) {
                pq.poll();
            }
            
            if (players[i] >= m) {
                int n = players[i] / m - pq.size();
                
                while (n > 0) {
                    pq.offer(new Server(i + k));
                    result++;
                    n--;
                }
            }
        }
        
        return result;
    }
}