import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                int lastIdx = stk.size() - 1;
                
                if (stk.get(lastIdx) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(lastIdx);
                }
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}