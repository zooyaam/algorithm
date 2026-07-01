class Solution {
    public int[] solution(int[] sequence, int k) {
        int resultL = 0;
        int resultR = Integer.MAX_VALUE;
        
        int l = 0;
        int sum = 0;
        
        for (int r = 0; r < sequence.length; r++) {
            sum += sequence[r];
            
            while (sum > k) {
                sum -= sequence[l];
                l++;
            }
            
            if (sum == k) {
                if (resultR - resultL > r - l) {
                    resultR = r;
                    resultL = l;
                }
                
                sum -= sequence[l];
                l++;
            }
        }
        
        return new int[]{resultL, resultR};
    }
}