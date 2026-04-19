class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k =j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if (isPrime(sum)) cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    public static boolean isPrime(int num) {
        for (int n = 2; n * n <= num; n++) {
            if (num % n == 0) return false;
        }
        
        return true;
    }
}