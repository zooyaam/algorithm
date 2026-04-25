import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] arr = new int[numbers.length];
        Arrays.fill(arr, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            while (!stack.isEmpty() && numbers[stack.peek()] < num) {
                int idx = stack.pop();
                arr[idx] = num;
            }
            
            stack.push(i);
        }
        
        return arr;
    }
}