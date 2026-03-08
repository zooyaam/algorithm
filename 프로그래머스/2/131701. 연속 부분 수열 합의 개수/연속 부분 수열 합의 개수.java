import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int l = elements.length;
        int[] arr = new int[l * 2];
        
        for (int i = 0; i < l; i++) {
            arr[i] = elements[i];
            arr[i + l] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int len = 1; len <= l; len++) {
            int sum = 0;
            
            for (int i = 0; i < len; i++) {
                sum += arr[i];
            }
            
            // 슬라이딩 윈도우 
            for (int s = 0; s < l; s++) {
                set.add(sum);
                sum = sum - arr[s] + arr[s + len];
            }
        }
        
        return set.size();
    }
}