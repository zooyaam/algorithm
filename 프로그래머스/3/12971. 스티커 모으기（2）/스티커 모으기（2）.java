class Solution {
    public int solution(int sticker[]) {
        int N = sticker.length;
        
        if (N < 2) return sticker[0];
        
        // 첫번째 스티커 선택
        int[] dp_1 = new int[N];
        dp_1[0] = sticker[0];
        dp_1[1] = sticker[0];
        
        for (int i = 2; i < N - 1; i++) {
            dp_1[i] = Math.max(dp_1[i-1], dp_1[i-2] + sticker[i]);
        }
        
        // 마지막 요소 선택
        int[] dp_2 = new int[N];
        dp_2[1] = sticker[1];
        
        
        for (int i = 2; i < N; i++) {
            dp_2[i] = Math.max(dp_2[i-1], dp_2[i-2] + sticker[i]);
        }
        
        return Math.max(dp_1[N-2], dp_2[N-1]);
    }
}