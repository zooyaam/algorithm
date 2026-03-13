import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> type = new HashSet<>();
        
        for (int num : nums) type.add(num);
        
        return Math.min(type.size(), nums.length / 2);
    }
}