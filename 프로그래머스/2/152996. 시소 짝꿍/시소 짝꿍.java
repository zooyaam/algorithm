import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Arrays.sort(weights);
        
        Map<Double, Integer> map = new HashMap<>();
        
        long result = 0;
        for (int w : weights) {
            result += map.getOrDefault((double) w, 0);
            result += map.getOrDefault(w * 2.0 / 3, 0);
            result += map.getOrDefault(w * 1.0 / 2, 0);
            result += map.getOrDefault(w * 3.0 / 4, 0);

            map.put((double) w, map.getOrDefault((double) w, 0) + 1);
        }

        return result;
    }
}