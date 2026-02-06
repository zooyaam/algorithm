import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        for (int i = 0; i < intStrs.length; i++) {
            intStrs[i] = intStrs[i].substring(s, s+l);
        }
        
        int[] result = Arrays.stream(intStrs)
            .mapToInt(Integer::parseInt)
            .filter(n -> n > k)
            .toArray();
            
        return result;        
    }
}