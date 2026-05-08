import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            char change = c;
            
            int i = 0;
            while (i < index) {
                if (c == 'z') {
                    c = 'a';
                } else {
                    c += 1;
                }
                
                if (!skip.contains(String.valueOf(c))) {
                    i++;
                }
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}