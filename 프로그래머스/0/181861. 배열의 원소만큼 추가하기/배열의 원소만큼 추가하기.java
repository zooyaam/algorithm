import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int n : arr) {
            int i = 0;
            
            while (i < n) {
                result.add(n);
                i++;
            }
        }
        
        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}