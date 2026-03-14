import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cl : clothes) {
            String type = cl[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int result = 1;
        
        for (int value : map.values()) result *= value + 1;
        
        return result - 1;
    }
}