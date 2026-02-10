import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        
        e = Math.min(e, my_string.length() - 1);
        
        StringBuilder reversed = new StringBuilder(my_string.substring(s, e+1)).reverse();
        
        sb.replace(s, e+1, reversed.toString());
        
        return sb.toString();
    }
}