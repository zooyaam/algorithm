import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 거듭제곱 구하기
        int power = Integer.highestOneBit(arr.length);
        if (arr.length != power) power = power << 1;
        
        // 정답 배열 생성
        int[] result = new int[power];
        Arrays.fill(result, 0);
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        
        return result;
    }
}