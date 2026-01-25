import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int times = Arrays.stream(num_list).reduce(1, (acc, cur) -> acc * cur);
        int sumPow = (int) Math.pow(Arrays.stream(num_list).reduce(0, (acc, cur) -> acc + cur), 2);
        
        return times < sumPow ? 1 : 0;
    }
}