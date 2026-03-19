class Solution {
    int result = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return result;
    }
    
    private void dfs(int[] numbers, int target, int idx, int curr) {
        if (idx == numbers.length) {
            if (curr == target) result++;
            return;
        }
        
        dfs(numbers, target, idx + 1, curr + numbers[idx]);
        dfs(numbers, target, idx + 1, curr - numbers[idx]);
    }
}