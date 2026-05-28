class Solution {
    public int[] solution(int[][] arr) {
        int[] result = new int[2];
        
        compress(arr, result, 0, 0, arr.length);
        
        return result;
    }
    
    public void compress(int[][] arr, int[] result, int x, int y, int size) {
        int num = arr[x][y];
        
        boolean same = true;
        
        for (int i = x; i < x + size; i++) {
            if (!same) break;
            
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != num) {
                    same = false;
                    break;
                }
            }
        }
        
        if (same) result[num]++;
        else {
            int half = size / 2;
            
            compress(arr, result, x, y, half);
            compress(arr, result, x + half, y, half);
            compress(arr, result, x, y + half, half);
            compress(arr, result, x + half, y + half, half);
        }
    }
}