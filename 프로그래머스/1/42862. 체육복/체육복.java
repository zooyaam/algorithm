class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n+2];
        for (int l : lost) arr[l] -= 1;
        for (int r : reserve) arr[r] += 1;
        
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == -1) {
                if (arr[i+1] == 1) {
                    arr[i] = 0;
                    arr[i+1] = 0;
                    result++;
                }
            } else if (arr[i] == 1) {
                if (arr[i+1] == -1) {
                    arr[i] = 0;
                    arr[i+1] = 0;
                }
                result++;
            } else if (arr[i] == 0) {
                result++;
            }
        }
        
        return result;
    }
}