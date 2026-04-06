import java.util.*;

class Solution {
    public int solution(String s) {
        int cnt = 0;
        
        if (isValid(s)) cnt++;
        
        for (int i = 1; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (isValid(s)) cnt++;
        }
        
        return cnt;
    }
    
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                char last = stack.pop();
                
                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) return false;
            }
        }
        
        return stack.isEmpty();
    }
}