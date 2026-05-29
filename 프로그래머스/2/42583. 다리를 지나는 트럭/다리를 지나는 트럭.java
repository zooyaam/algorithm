import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> wait = new LinkedList<>(); // 대기큐
        Queue<Integer> bridge = new LinkedList<>(); // 다리 위
        
        for (int truck : truck_weights) wait.offer(truck);
        for (int i = 0; i < bridge_length; i++) bridge.offer(0);
        
        int t = 0;
        int w = 0;
        
        while (!wait.isEmpty()) {
            w -= bridge.poll();
            
            if (w + wait.peek() <= weight) {
                int truck = wait.poll();
                bridge.offer(truck);
                w += truck;
            }
            else bridge.offer(0);
            
            t++;
        }
        
        return t + bridge_length;
    }
}