import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : win_nums) {
            set.add(num);
        }
        
        int zeroCnt = 0;
        int correctCnt = 0;
        for (int num : lottos) {
            if (num == 0) zeroCnt++;
            if (set.contains(num)) correctCnt++;
        }
        
        int[] result = new int[2];
        result[0] = Math.min(7 - (correctCnt + zeroCnt), 6);
        result[1] = Math.min(7 - correctCnt, 6);
        
        return result;
    }
}