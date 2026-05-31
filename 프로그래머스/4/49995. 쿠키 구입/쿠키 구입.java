class Solution {
    public int solution(int[] cookie) {
        int n = cookie.length;
        
        int result = 0;

        for (int m = 0; m < n - 1; m++) {
            int l = m;
            int r = m + 1;

            int lSum = cookie[l];
            int rSum = cookie[r];

            while (true) {
                if (lSum == rSum) {
                    result = Math.max(result, lSum);
                }

                if (lSum <= rSum) {
                    l--;
                    if (l < 0) break;
                    lSum += cookie[l];
                } 
                else {
                    r++;
                    if (r >= n) break;
                    rSum += cookie[r];
                }
            }
        }

        return result;
    }
}