import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            
            if (flag[i]) {
                while (j < arr[i] * 2) {
                    result.add(arr[i]);
                    j++;
                }
            } else {
                while (j < arr[i]) {
                    result.remove(result.size() - 1);
                    j++;
                }
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}