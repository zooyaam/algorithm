class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        
        int i = 0;
        while (i < n) {
            arr[i][i] = 1;
            i++;
        }
        
        return arr;
    }
}