class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52];
        
        for (char c : my_string.toCharArray()) {
            if ('A' <= c && 'Z' >= c) {
                arr[c - 65]++;
            } else {
                arr[c - 97 + 26]++;
            }
        }
        
        return arr;
    }
}