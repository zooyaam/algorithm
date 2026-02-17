class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        int idx = 0;
        while (result <= n) {
            result += numbers[idx];
            idx++;
        }
        
        return result;
    }
}