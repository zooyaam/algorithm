import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        
        // 원하는 상품 목록 Map
        Map<String, Integer> wants = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wants.put(want[i], number[i]);
        }
        
        // 현재 윈도우 Map
        Map<String, Integer> curr = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            curr.put(discount[i], curr.getOrDefault(discount[i], 0) + 1);
        }
        
        for (int i = 0; i < discount.length - 9; i++) {
            if (wants.equals(curr)) result++;
            if (i == discount.length - 10) break;

            // 슬라이딩 윈도우 처리
            curr.put(discount[i], curr.get(discount[i]) - 1);
            if (curr.get(discount[i]) == 0) curr.remove(discount[i]);
            
            curr.put(discount[i + 10], curr.getOrDefault(discount[i + 10], 0) + 1);
        }
        
        return result;
    }
}