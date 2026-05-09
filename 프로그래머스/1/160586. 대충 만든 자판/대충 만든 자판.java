import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                
                if (!map.containsKey(c)) {
                    map.put(c, i + 1);
                } else {
                    map.put(c, Math.min(map.get(c), i + 1));
                }
            }
        }
        
        int[] result = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            for (char c : target.toCharArray()) {
                if (!map.containsKey(c)) {
                    result[i] = -1;
                    break;
                }
                result[i] += map.get(c);
            }
        }
        
        return result;
    }
}