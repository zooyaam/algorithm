import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isValidate(i)) {
                result.add(i);
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isValidate(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}