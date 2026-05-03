import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;
        
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(x);

        boolean[] visited = new boolean[y + 1];
        
        int cnt = 0;
        while (!que.isEmpty()) {
            cnt++;
            int size = que.size();
            
            for (int i = 0; i < size; i++) {
                int num = que.poll();
                int[] nexts = {num + n, num * 2, num * 3};

                for (int next : nexts) {
                    if (next == y) return cnt;
                    
                    if (next <= y && !visited[next]) {
                        visited[next] = true;
                        que.offer(next);
                    }
                }
            }
        }
        
        return -1;
    }
}