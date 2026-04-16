import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < topping.length; i++) {
            int t = topping[i];
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        int cnt = 0;
        
        for (int i = 0; i < topping.length; i++) {
            int t = topping[i];
            
            set.add(t);
            map.put(t, map.get(t) - 1);
            if (map.get(t) == 0) map.remove(t);
            
            if (set.size() == map.size()) cnt++;
        }
        
        return cnt;
    }
}