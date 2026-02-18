class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            
            if (x >= 50 && x % 2 == 0) {
                result[i] = x / 2;
            } else if (x < 50 && x % 2 == 1) {
                result[i] = x * 2;
            } else {
                result[i] = x;
            }
        }
        
        return result;
    }
}
