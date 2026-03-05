class Solution {
    public int solution(int a, int b) {
        if (isOdd(a) && isOdd(b)) {
            return a * a + b * b;
        } else if (isOdd(a) || isOdd(b)) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
    
    private boolean isOdd(int n) {
        return n % 2 != 0;
    }
}