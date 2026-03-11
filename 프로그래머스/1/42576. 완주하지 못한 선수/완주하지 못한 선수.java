import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> part = new HashMap<>();
        
        for (String p : participant) {
            part.put(p, part.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            part.put(c, part.get(c) - 1);
            
            if (part.get(c) == 0) part.remove(c);
        }
        
        return part.keySet().iterator().next();
    }
}