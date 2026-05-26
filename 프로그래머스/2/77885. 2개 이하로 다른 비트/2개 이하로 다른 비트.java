class Solution {
    public long[] solution(long[] numbers) {
        long[] result = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            result[i] = func(numbers[i]);
        }
        
        return result;
    }
    
    public long func(long num) {
        // 짝수의 경우 + 1
        if (num % 2 == 0) {
            return num + 1;    
        }
        
        // 홀수의 경우 
        // 제일 마지막에 등장하는 0을 1로 변환
        // 그 다음 1을 0으로 변환
        else {
            return num + 1 + ((num ^ (num + 1)) >> 2);
        }
    }
}