import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        switch (map.size()) {
            case 1:
                return a * 1111;
                
            case 2:
                boolean has3 = false;
                int p = 0, q = 0;
                
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 3) {
                        has3 = true;
                        p = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }
                
                if (has3) {
                    return (10 * p + q) * (10 * p + q);
                } else {
                    Iterator<Integer> it = map.keySet().iterator();
                    int x = it.next();
                    int y = it.next();
                    return (x + y) * Math.abs(x - y);
                }
                
            case 3:
                int result = 1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 1) {
                        result *= entry.getKey();
                    }
                }
                return result;
                
            case 4:
                return nums[0];
        }
        
        return 0;
    }
}
