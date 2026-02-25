import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);
        
        Set<Integer> set = new HashSet<>();
        
        int i = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                result[i] = num;
                i++;
                
                if (i == k) break;
            }
        }
        
        return result;
    }
}