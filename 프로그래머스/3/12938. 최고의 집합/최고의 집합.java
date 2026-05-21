import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        if (n > s) return new int[]{-1};
        
        int[] result = new int[n];
        
        int a = s / n;
        Arrays.fill(result, a);
        
        int b = s % n;
        int i = n - 1;
        while (b > 0) {
            b--;
            result[i]++;
            i--;
        }
        
        return result;
    }
}