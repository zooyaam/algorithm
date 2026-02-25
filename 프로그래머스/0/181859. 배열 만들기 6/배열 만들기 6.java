import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length) {
            int size = stk.size();
            
            if (size < 1) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(size - 1) == arr[i]) {
                stk.remove(size - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        if (stk.size() < 1) stk.add(-1);
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}