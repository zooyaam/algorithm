class Solution {
    public int solution(int number, int n, int m) {
        int r1 = number % n;
        int r2 = number % m;
        
        if (r1 == 0 && r2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}