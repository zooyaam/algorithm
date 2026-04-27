import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        while (sb.length() < t * m) {
            sb.append(Integer.toString(num, n).toUpperCase());
            num++;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = p - 1; result.length() < t; i += m) {
            result.append(sb.charAt(i));
        }
        
        return result.toString();
    }
}