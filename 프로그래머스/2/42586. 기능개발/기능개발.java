import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int l = progresses.length;
        int[] days = new int[l];
        
        for (int i = 0; i < l; i++) {
            days[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        
        int num = days[0];
        int cnt = 1;
        
        for (int j = 1; j < l; j++) {
            if (num < days[j]) {
                list.add(cnt);
                cnt = 1;
                num = days[j];
            } else {
                cnt++;
            }
        }
        
        list.add(cnt);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}