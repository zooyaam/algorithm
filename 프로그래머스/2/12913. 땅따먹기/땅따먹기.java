class Solution {
    int solution(int[][] land) {
        // N행 4열
        int[][] dp = new int[land.length][4];
        
        for (int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }
        
        for (int i = 1; i < land.length; i++) {
            int prevMax1 = 0, prevMax2 = 0;
            int maxIdx = -1;
            
            for (int j = 0; j < 4; j++) {
                if (dp[i-1][j] > prevMax1) {
                    prevMax2 = prevMax1;
                    prevMax1 = dp[i-1][j];
                    maxIdx = j;
                } else if (dp[i-1][j] > prevMax2) {
                    prevMax2 = dp[i-1][j];
                }
            }
            
            for (int k = 0; k < 4; k++) {
                dp[i][k] = land[i][k] + (k == maxIdx ? prevMax2 : prevMax1);
            }
        }
        
        int max = 0;
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, dp[land.length - 1][i]);
        }
        
        return max;
    }
}