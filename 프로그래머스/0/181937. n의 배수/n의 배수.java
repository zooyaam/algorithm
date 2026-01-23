class Solution {
    public int solution(int num, int n) {
        int r = num % n;
        if (r > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}