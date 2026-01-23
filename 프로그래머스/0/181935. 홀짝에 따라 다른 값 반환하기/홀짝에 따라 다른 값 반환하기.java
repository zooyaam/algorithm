class Solution {
    public int solution(int n) {
        int res = 0;
        boolean isOdd = n % 2 != 0;
        
        while (n > 0) {
            if (isOdd) {
                res += n;
            } else {
                res += n * n;
            }
            
            n -= 2;
        }
        
        return res;
    }
}