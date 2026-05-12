import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int cnt = 0;
        
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            
            while (j < B.length && B[j] <= a) j++;
            
            if (j < B.length) {
                cnt++;
                j++;
            }
        }
        
        return cnt;
    }
}