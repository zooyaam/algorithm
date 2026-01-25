import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int num = Integer.MAX_VALUE;
            
            for (int idx = queries[i][0]; idx <= queries[i][1]; idx++) {
                if (arr[idx] > queries[i][2] && arr[idx] < num) {
                    num = arr[idx];
                }
            }
            
            if (num == Integer.MAX_VALUE) {
                result[i] = -1;
            } else {
                result[i] = num;
            }
        }
        
        return result;
    }
}