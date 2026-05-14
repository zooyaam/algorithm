import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 빨리 나가는 차량부터 정렬
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        
        int camera = Integer.MIN_VALUE;
        
        int cnt = 0;
        for (int[] route : routes) {
            int s = route[0];
            int e = route[1];
            
            if (camera < s) {
                camera = e;
                cnt++;
            }
        }
        
        return cnt;
    }
}