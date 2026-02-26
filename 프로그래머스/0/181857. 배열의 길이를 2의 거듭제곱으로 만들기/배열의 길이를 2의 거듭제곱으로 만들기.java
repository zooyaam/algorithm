import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 거듭제곱 구하기
        int power = Integer.highestOneBit(arr.length);
        if (arr.length != power) power = power << 1;
        
        // 정답 배열 생성
        return Arrays.copyOf(arr, power);
    }
}