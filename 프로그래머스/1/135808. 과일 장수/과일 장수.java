import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int result = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            result += score[i];
        }
        
        return result * m;
    }
}