import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int r = 2 * w + 1;

        int cnt = 0;
        int prev = 1;
        
        for (int st : stations) {
            int l = (st - w) - prev;
            
            if (l > 0) cnt += (l + r - 1) / r;
            prev = st + w + 1;
        }
        
        // 마지막 구간 처리
        if (prev <= n) {
            int l = n - prev + 1;
            cnt += (l + r - 1) / r;
        }
        
        return cnt;
    }
}