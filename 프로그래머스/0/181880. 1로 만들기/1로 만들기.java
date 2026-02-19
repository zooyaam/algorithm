class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        
        for (int n : num_list) {
            result += func(n);
        }
        
        return result;
    }
    
    private int func(int num) {
        int cnt = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num - 1) / 2;
            }
            cnt++;
        }
        
        return cnt;
    }
}