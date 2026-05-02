import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> sub = new Stack<>();
        
        int result = 0;
        
        int c = 1;
        int idx = 0;
        
        while (true) {
            // 보조 컨테이너에서 꺼내기
            if (!sub.isEmpty() && sub.peek() == order[idx]) {
                sub.pop();
                idx++;
                result++;
            }
            
            // 컨테이너에서 꺼내기
            else if (c <= order.length) {
                if (c == order[idx]) {
                    idx++;
                    result++;
                } else {
                    sub.push(c);
                }
                c++;
            }
            
            else break;
        }
        
        return result;
    }
}